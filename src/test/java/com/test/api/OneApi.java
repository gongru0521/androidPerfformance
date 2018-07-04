package com.test.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;

import javax.swing.text.html.parser.Entity;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;



public class OneApi {

//刷新列表接口	
	String link="http://test.c.api.kkpbcdn.com/gateway?";
	
	String paras="device=1&sign=2156dedfba629f286cd8b6f13d56a3b3&source=Redmi Note 2 5.0.2&method=kkpb.order.lists&appkey=1&token=1BF9B956AC65F50C09F9842AAB7503C8&timestamp=1530514150&apiversion=V1&format=json&lng=113.608369&version=2.2.1&lat=34.80142&page=1&user_id=411586";
	
	GsonUtil gson=new GsonUtil();
	HttpURLConnection conn;
	String content;
	String ss="";
	PrintWriter pw;
	StringBuffer contents=new StringBuffer();
	

	Logger logger=Logger.getLogger(OneApi.class);

	//建立连接
	@Test
	public void testapi() throws IOException{
		//调用日志文件
		PropertyConfigurator.configure("./resource/log4j.properties");
		logger.info("testcase result!");
		
		//建立连接
		URL url=new URL(link);
		conn=(HttpURLConnection)url.openConnection();
		
		conn.setRequestMethod("POST");
		
		conn.setDoOutput(true);
		//头部传递
		conn.setRequestProperty("Content-type",  "application/x-www-form-urlencoded;charset=utf-8");
	
		//开始传递信息
		// 获取URLConnection对象对应的输出流
		pw=new PrintWriter(conn.getOutputStream());
		
		//传递参数
		pw.print(paras);
		pw.flush();
        pw.close();
        //
        logger.info("conn.getResponseCode():"+conn.getResponseCode());
//        System.out.println("conn.getResponseCode():"+conn.getResponseCode());
//		System.out.println("conn.getResponseMessage():"+conn.getResponseMessage());
        logger.info("conn.getResponseMessage():"+conn.getResponseMessage());
		// 定义BufferedReader输入流来读取URL的响应
		InputStreamReader isr=new InputStreamReader(conn.getInputStream());
		
		BufferedReader br=new BufferedReader(isr);
		String line=null;
		
		while((line=br.readLine())!=null){
			
			ss=line+ss;
			
		}
		
		//解析json
		
		
		//需要创建一个解析器，可以用来解析字符串或输入流

		JsonParser parser=new JsonParser();
		//JsonObject是JsonElement的子类，所以需要强转

		
		
		JsonObject object=(JsonObject) parser.parse(ss);
		//依据 json 格式里的数据类型
		logger.info("code:"+object.get("code").getAsString());
//	System.out.println("code:"+object.get("code").getAsString());
//	
//	System.out.println("message:"+object.get("message").getAsString());
	logger.info("message:"+object.get("message").getAsString());
	//接着读取test.json里的JSON数组，名称是languages（键）

	//创建一个JsonArray
	JsonArray arra=object.get("data").getAsJsonArray();
	for(int i=0;i<arra.size();i++){
		logger.info("第"+i+"条数据");
		//System.out.println("第"+i+"条数据");
		JsonObject subObject=arra.get(i).getAsJsonObject();
		//System.out.println("subObject:"+subObject);
		logger.info("data:"+subObject);
		
		
	//	System.out.println("add_time:"+subObject.get("add_time").getAsString());
		
	}
	
	
	}
	
}
