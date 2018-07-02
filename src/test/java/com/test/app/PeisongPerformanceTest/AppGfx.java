package com.test.app.PeisongPerformanceTest;

import java.io.IOException;
import java.util.TimerTask;



public class AppGfx extends TimerTask{
	
//public class AppGfx extends Thread{

	@Override
	public void run(){
		System.out.println("执行测试命令AppGfx！");
		//super.run();
		String commandgfx="adb shell dumpsys gfxinfo com.itsenpupulai.courierport";
		String name="gfxinfo";
		try {
		//System.out.println("1!");
			Execomand.execcommand(commandgfx,name);
			System.out.println("结束！");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("2!");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
		
	

}
