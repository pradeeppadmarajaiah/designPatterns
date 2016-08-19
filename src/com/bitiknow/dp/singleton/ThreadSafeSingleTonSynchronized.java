package com.bitiknow.dp.singleton;

public class ThreadSafeSingleTonSynchronized {

	private static ThreadSafeSingleTonSynchronized safeSingleTonSynchronized = null;

	private ThreadSafeSingleTonSynchronized() {

	}

	public ThreadSafeSingleTonSynchronized getInstance() {
		if (safeSingleTonSynchronized == null) {
			synchronized (ThreadSafeSingleTonSynchronized.class) {
				if (safeSingleTonSynchronized == null) {
					safeSingleTonSynchronized = new ThreadSafeSingleTonSynchronized();
				}
			}
		}
		return new ThreadSafeSingleTonSynchronized();

	}

}
