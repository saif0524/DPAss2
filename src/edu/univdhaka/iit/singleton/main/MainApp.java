package edu.univdhaka.iit.singleton.main;

import java.util.LinkedList;

import edu.univdhaka.iit.singleton.utils.Singleton;

public class MainApp {

	public static void main(String[] args) {

		// First instance
		Singleton firstInstance = Singleton.getInstance();

		System.out.println("Object 1 ID: " + firstInstance);

		System.out.println(firstInstance.getLinkedLetterList());

		LinkedList<String> firstSet = firstInstance.getLetterSet(5);

		System.out.println("First LetterSet: " + firstSet);

		System.out.println(firstInstance.getLinkedLetterList());

		// Creating another instance
		Singleton secondInstance = Singleton.getInstance();

		System.out.println("Object 2 ID: " + secondInstance);

		System.out.println(secondInstance.getLinkedLetterList());

		LinkedList<String> secondSet = secondInstance.getLetterSet(5);

		System.out.println("Second LetterSet: " + secondSet);

		System.out.println(secondInstance.getLinkedLetterList());

	}

}
