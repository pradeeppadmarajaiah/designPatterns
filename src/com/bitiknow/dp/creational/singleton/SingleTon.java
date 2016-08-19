package com.bitiknow.dp.creational.singleton;

public class SingleTon {
	// To get only instance of a class;
	private static SingleTon singleTon = null;

	// Creating a private constructor
	private SingleTon() {

	}

	// Method through which the singleTon variable will get access, not
	// directly.
	public static synchronized SingleTon getInstance() {
		if (singleTon == null) {
			singleTon = new SingleTon();
		}
		return singleTon;

	}

}
