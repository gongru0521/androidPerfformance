package com.test.app.PeisongPerformanceTest;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimerTask;

public class TimeTask extends TimerTask {
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Timer:"+sdf.format(new Date()));
		
		
		

	}

}
