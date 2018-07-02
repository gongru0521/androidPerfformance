package com.test.app.PeisongPerformanceTest;

import java.io.IOException;

public class TopTest extends Thread {
	
@Override
	
	public void run(){
		System.out.println("comdTop5执行run方法:");
		try {
			String name="comdtop5";
			
			String comdcpu=ProperGot.gotmessage(name);
			
			Execomand.execcommand(comdcpu,name);
		
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}

}
