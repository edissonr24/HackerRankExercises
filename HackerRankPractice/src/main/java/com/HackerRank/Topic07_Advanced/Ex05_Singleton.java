package com.HackerRank.Topic07_Advanced;

public class Ex05_Singleton {

	public String str;
	private static Ex05_Singleton singleton;
	
	private Ex05_Singleton() {}
	
	public static Ex05_Singleton getSingleInstance() {
		if (singleton == null) {
			singleton = new Ex05_Singleton();
		}
		return singleton;
	}
	
}
