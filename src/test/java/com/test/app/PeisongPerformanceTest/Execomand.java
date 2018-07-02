package com.test.app.PeisongPerformanceTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Execomand {
	//执行命令方法
		public static void execcommand(String cmd,String name) throws IOException, InterruptedException{
			System.out.println("进入execcommand！");
		//	Thread.sleep(1000);
			System.out.println("cmd:"+cmd);
			Process p=Runtime.getRuntime().exec(cmd);
			
			InputStreamReader ins=new InputStreamReader(p.getInputStream());
			BufferedReader br=new BufferedReader(ins);
			String line=null;
			System.out.println("循环之前");
			int i=0;
			
			while((line=br.readLine())!=null){
				
				writelog(line,name);
				System.out.println("i:"+i);
				i++;
				
				
				
			}


			br.close();
			
			
		}
	//保存日志信息到文件中
		public static void writelog(String line,String name) throws IOException {
			// TODO Auto-generated method stub
			
			System.out.println("进入writelog！");
			//
			String content=line;
			
			//String url="F:\\workspace\\PeisongPerformanceTest\\Logs";
			String url="F:\\workspace\\PeisongPerformanceTest\\Logs";
		//	String url="/PeisongPerformanceTest/Logs";
			
			//创建文件name
			String times=GetNowTime.gottime();
			String formattimes=times.replaceAll(" ","").replaceAll(":","").replaceAll("-","");
			//
		//	String filename=name+formattimes+".txt";
			String filename=name+".txt";
			System.out.println("文件名称:"+filename);
			
			File file=new File(url,filename);
			
			//输出流
			FileOutputStream fils=new FileOutputStream(file, true);
			OutputStreamWriter osw=new OutputStreamWriter(fils, "GBK");
			BufferedWriter bw=new BufferedWriter(osw);
			bw.write(content);
			System.out.println("content:"+content);
			bw.write("\n");
			bw.flush();
			bw.close();
			
			
			
				
				
			
			
			
			
			
			
		}

}
