/**
 * 
 */
package com.bitiknow.dp.singleton;

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
