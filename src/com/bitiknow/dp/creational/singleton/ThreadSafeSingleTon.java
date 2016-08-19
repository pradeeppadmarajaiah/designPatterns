package com.bitiknow.dp.creational.singleton;

public class ThreadSafeSingleTon {
	private ThreadSafeSingleTon() {

	}

	private static ThreadSafeSingleTon safeSingleTon = null;

	public synchronized ThreadSafeSingleTon getInstance() {
		if (safeSingleTon == null) {
			safeSingleTon = new ThreadSafeSingleTon();
		}
		return safeSingleTon;

	}
}
