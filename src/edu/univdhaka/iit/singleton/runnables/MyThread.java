package edu.univdhaka.iit.singleton.runnables;

import java.util.LinkedList;

import edu.univdhaka.iit.singleton.utils.Singleton;

public class MyThread implements Runnable {

	@Override
	public void run() {

		// First instance
		Singleton firstObject = Singleton.getInstance();

		System.out.println("Object 1 ID: " + firstObject);

		System.out.println(firstObject.getLinkedLetterList());

		LinkedList<String> firstSet = firstObject.getLetterSet(5);

		System.out.println("First LetterSet: " + firstSet);

		System.out.println(firstObject.getLinkedLetterList());

		/*
		 * System.out.println(threadName + " started.");
		 * 
		 * try { System.out.println(threadName + " is going to sleep");
		 * Thread.currentThread(); Thread.sleep(300); } catch
		 * (InterruptedException e) { e.printStackTrace(); }
		 */
	}
}
