package com.test.app.PeisongPerformanceTest;
import java.io.IOException;

//封装所有的命令方法

public class PuPerfomance extends Thread {
	String names;
	String comd;
	
	public String getNames() {
		return names;
	}
	public void setNames(String names) {
		this.names = names;
	}

	public String getComd() {
		return comd;
	}
	public void setComd(String comd) {
		this.comd = comd;
	}
	
@Override
	public void run(){
	try {
		Execomand.execcommand(comd,names);
		System.out.println("命令执行结束");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
	}

}
