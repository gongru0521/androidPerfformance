package com.test.app.PeisongPerformanceTest;

import java.io.IOException;

public class CpuTest extends Thread {
	@Override
	
	public void run(){
		System.out.println("cpuTest执行run方法:");
		try {
			
			for(int i=0;i<10;i++){
			String comdcpu=ProperGot.gotmessage("comdcpu");
			String name="cpuinfo";
			Execomand.execcommand(comdcpu,name);
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}

}
