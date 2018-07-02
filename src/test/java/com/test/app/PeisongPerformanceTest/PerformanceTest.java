package com.test.app.PeisongPerformanceTest;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import org.junit.Test;

public class PerformanceTest {
	//根据不同的命令获取不同的性能测试数据
	AppGfx gfx=new AppGfx();
	CpuTest cpu=new CpuTest();
	
	@Test
	public void  pertest() throws InterruptedException, IOException{
		
		//gfx.run();
		
		
	//	cpu.run();
Timer timer=new Timer(false);
TimeTask task=new TimeTask();



//timer.scheduleAtFixedRate(gfx, 0, 30000);
////gfx.run();
//for(int i=0;i<100;i++){
//	System.out.println("i:"+i);
//	Thread.sleep(1000);
//	
//	
//}
//new TopTest().run();
//gfx图形图像测试脚本,通过抽象类设置cmd和name
PuPerfomance gfx2=new PuPerfomance();
String comd=ProperGot.gotmessage("comdgfx");;
String name="gfxresult";
gfx2.setComd(comd);
gfx2.setNames(name);
gfx2.run();


		
	}
	
	
	
}
