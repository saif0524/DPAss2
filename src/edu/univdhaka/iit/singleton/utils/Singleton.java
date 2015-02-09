package edu.univdhaka.iit.singleton.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
 * Created by : Saif Uddin Mahmud
 * 				(BSSE0524)
 * Created for: Design Pattern Assignment on 'Singleton Pattern'
 * Date		  : February 8, 2015
 */

public class Singleton {

	private static Singleton instance = null;

	String[] letters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
			"n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z",};
	
	LinkedList<String> linkedLetterList = new LinkedList<String>(Arrays.asList(letters));
	
	List<String> letterList = new ArrayList<String>();
	
	
	private static boolean thread1 = true;
	
	
	private Singleton() {
		// Constructor only exists to defeat instantiation
	}

	public static Singleton getInstance() {
		if (instance == null) {

			if (thread1) {

				thread1 = false;
				
				System.out.println("Thread1 is sleeping");
				
				Thread.currentThread();
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			
			instance = new Singleton();
			// System.out.println("Singleton object instantiated..yaayyy!");
		}
		return instance;
	}

	/*
	 * public static void randomThread() {
	 * 
	 * MyThread thread1 = new MyThread("First Thread"); MyThread thread2 = new
	 * MyThread("Second Thread");
	 * 
	 * thread1.run(); thread2.run();
	 * 
	 * 
	 * }
	 */

	
	public LinkedList<String> getLinkedLetterList(){
		
		return instance.linkedLetterList;
	}
	
	
	public LinkedList<String> getLetterSet(int numOfLetters){
		
		LinkedList<String> letterSetToReturn = new LinkedList<String>();
		
		for(int i=0; i<numOfLetters;i++){
			letterSetToReturn.add(instance.linkedLetterList.remove(0));	
		}
		
		return letterSetToReturn;
	}
		
	
	public void writeLogs() {
		System.out.println("Writing logs.... ");
	}

}