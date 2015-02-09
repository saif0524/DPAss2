package edu.univdhaka.iit.singleton.main;

import java.util.LinkedList;

import edu.univdhaka.iit.singleton.utils.Singleton;

public class MainApp {

	public static void main(String[] args) {

		
		//First instance
		Singleton firstObject = Singleton.getInstance();

		System.out.println("Object 1 ID: " + firstObject);

		System.out.println(firstObject.getLinkedLetterList());

		LinkedList<String> firstSet = firstObject.getLetterSet(5);

		System.out.println("First LetterSet: " + firstSet);

		System.out.println(firstObject.getLinkedLetterList());

		
		//Creating another instance
		Singleton secondObject = Singleton.getInstance();

		System.out.println("Object 2 ID: " + secondObject);

		System.out.println(secondObject.getLinkedLetterList());

		LinkedList<String> secondSet = secondObject.getLetterSet(5);

		System.out.println("Second LetterSet: " + secondSet);

		System.out.println(secondObject.getLinkedLetterList());

	}

}
