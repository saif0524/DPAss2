package edu.univdhaka.iit.singleton.utils;
/*
 * Created by : Saif Uddin Mahmud
 * 				(BSSE0524)
 * Created for: Design Pattern Assignment on 'Singleton Pattern'
 * Date		  : February 8, 2015
 */

public class Singleton {

	private static  Singleton instance  = null;
	
//	private static boolean thread1 =true;
	
	private Singleton(){ 
		//Constructor only exists to defeat instantiation
	}
	
	public synchronized static Singleton getInstance(){
		if(instance==null){
			randomThread();
			instance = new Singleton();
//			System.out.println("Singleton object instantiated..yaayyy!");
		}
		return instance;
	}
	
	public static void randomThread() {

		MyThread thread1 = new MyThread("First Thread");
		MyThread thread2 = new MyThread("Second Thread");
	
		thread1.run();
		thread2.run();
		
/*		
		try{
			if(thread1){
				thread1 = false;
				System.out.println("Thread1 is sleeping");
				Thread.currentThread().sleep(500);
			}
		}catch(InterruptedException e){
			e.printStackTrace();
		}
*/		
	}
	
	public void writeLogs(){
		System.out.println("Writing logs.... ");
	}
	
}