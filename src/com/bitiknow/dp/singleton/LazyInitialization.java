/**
 * 
 */
package com.bitiknow.dp.singleton;

/**
 * @author pradeep
 *
 */
public class LazyInitialization {

	private LazyInitialization() {

	}

	private static LazyInitialization initialization = null;

	public static LazyInitialization getInstance() {
		if (initialization == null) {
			initialization = new LazyInitialization();
		}
		return initialization;

	}
}
