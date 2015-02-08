package edu.univdhaka.iit.singleton.utils;

import org.junit.experimental.theories.Theories;

public class MyThread implements Runnable{
	
	private String threadName;
	
	public MyThread(String theadName){
		this.threadName=theadName;
	}
	
	public void run(){
		
		System.out.println(threadName + " has been started.");
	
		try {
			System.out.println(threadName +" is going to sleep");
			Thread.currentThread();
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
