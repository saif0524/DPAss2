package edu.univdhaka.iit.singleton.test;


/*
 * Created by : Saif Uddin Mahmud
 * 				(BSSE0524)
 * Created for: Design Pattern Assignment on 'Singleton Pattern'
 * Date		  : February 8, 2015
 * 
 * Reference  :
 */


/*
 * This class is created for testing if the objects are same
 * or not, mainly for testing the effect of synchronization 
 */

import junit.framework.TestCase;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import edu.univdhaka.iit.singleton.utils.Singleton;

public class SingletonTest extends TestCase {

	private static Singleton singleton = null;

	public SingletonTest(String name) {
		super(name);
	}

	@Before
	public void setUp() {
		singleton = null;
	}

	@Test
	public void testUnique() throws InterruptedException {
		// Both threads call Singleton.getInstance().
		Thread threadOne = new Thread(new SingletonTestRunnable());
		Thread threadTwo = new Thread(new SingletonTestRunnable());
		threadOne.start();
		threadTwo.start();
		threadOne.join();
		threadTwo.join();
	}

	private static class SingletonTestRunnable implements Runnable {
		public void run() {
			// Get a reference to the singleton.
			Singleton s = Singleton.getInstance();
			// Protect singleton member variable from
			// multithreaded access.
			synchronized (SingletonTest.class) {
				if (singleton == null) // If local reference is null...
					singleton = s; // ...set it to the singleton
			}
			// Local reference must be equal to the one and
			// only instance of Singleton; otherwise, we have two
			// Singleton instances.
			Assert.assertEquals(true, s == singleton);
		}
	}

}
