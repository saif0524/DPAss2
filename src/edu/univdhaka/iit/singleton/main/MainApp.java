package edu.univdhaka.iit.singleton.main;

import edu.univdhaka.iit.singleton.utils.Singleton;

public class MainApp {

	public static void main(String[] args) {
		
		Singleton firstObject = Singleton.getInstance();
		
		firstObject.writeLogs();		
		
/*		Singleton secondObject = Singleton.getInstance();

		secondObject.writeLogs();
*/
	}

}
