package com.test.app.PeisongPerformanceTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ProperGot {

	public static String gotmessage(String key) throws IOException{
		
		//绝对路径
		
		//String propurl="F:\\workspace\\PeisongPerformanceTest\\resource\\comd.properties";
		
		//相对路径
		
		String url2="./resource/comd.properties";
		Properties pt=new Properties();
		FileInputStream is=new FileInputStream(new File(url2)) ;
		pt.load(is);
		is.close();
		
		return pt.getProperty(key);
		
	
		
	}
}
