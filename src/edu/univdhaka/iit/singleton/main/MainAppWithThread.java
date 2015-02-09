/*
 * Created by : Saif Uddin Mahmud
 * 				(BSSE0524)
 * Created for: Design Pattern Assignment on 'Singleton Pattern'
 * Date		  : February 9, 2015
 * 
 * Purpose of this Class: This class is created to check what happens if tow threads 
 * try to instantiate a singleton object
 */

package edu.univdhaka.iit.singleton.main;




import edu.univdhaka.iit.singleton.runnables.MyThread;

public class MainAppWithThread {
	public static void main(String[] args){
		Runnable getLetters = new MyThread();
		Runnable getLettersAgain = new MyThread();
		
		new Thread(getLetters).start();
		new Thread(getLettersAgain).start();
	}
}
