package com.test.app.PeisongPerformanceTest;


import java.text.SimpleDateFormat;
import java.util.Date;

public class GetNowTime {
	
	public static String gottime(){
		
		
		String date=null;
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		date=sdf.format(new Date()).toString();	;		
		return date;
	}

}
