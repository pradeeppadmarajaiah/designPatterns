/**
 * 
 */
package com.bitiknow.dp.creational.singleton;

/**
 * @author pradeep
 *
 */
public class EagerInitialization {

	private EagerInitialization() {

	}

	private static EagerInitialization eagerInitialization = new EagerInitialization();

	public static EagerInitialization getInstance() {
		return eagerInitialization;
	}

}
