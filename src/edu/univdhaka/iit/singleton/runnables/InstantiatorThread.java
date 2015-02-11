package edu.univdhaka.iit.singleton.runnables;

import java.util.LinkedList;

import edu.univdhaka.iit.singleton.utils.Singleton;

public class InstantiatorThread implements Runnable {

	@Override
	public void run() {

		Singleton singletonInstance = Singleton.getInstance();

		System.out.println("Object 1 ID: " + singletonInstance);

		System.out.println(singletonInstance.getLinkedLetterList());

		LinkedList<String> firstSet = singletonInstance.getLetterSet(5);

		System.out.println("First LetterSet: " + firstSet);

		System.out.println(singletonInstance.getLinkedLetterList());

		/*
		 * System.out.println(threadName + " started.");
		 * 
		 * try { System.out.println(threadName + " is going to sleep");
		 * Thread.currentThread(); Thread.sleep(300); } catch
		 * (InterruptedException e) { e.printStackTrace(); }
		 */
	}
}
