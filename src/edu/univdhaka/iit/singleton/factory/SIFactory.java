package edu.univdhaka.iit.singleton.factory;

import edu.univdhaka.iit.singleton.utils.Singleton;

/*
 * Created by : Saif Uddin Mahmud
 * 				(BSSE0524)
 * Created for: Design Pattern Assignment on 'Singleton Pattern'
 * Date		  : February 8, 2015
 */

public class SIFactory {

	private Singleton instance;

	public SIFactory(){
		instance = Singleton.getInstance();
	}
}
