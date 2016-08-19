package com.bitiknow.dp.singleton;

import java.lang.reflect.Constructor;

public class ReflectionSingletonTest {
	public static void main(String[] args) {
		BillPughSingleTon instanceOne = BillPughSingleTon.getInstance();
		BillPughSingleTon instanceTwo = null;
		try {
			Constructor[] constructors = BillPughSingleTon.class.getDeclaredConstructors();
			for (Constructor constructor : constructors) {
				// Below code will destroy the singleton pattern
				constructor.setAccessible(true);
				instanceTwo = (BillPughSingleTon) constructor.newInstance();
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(instanceOne.hashCode());
		System.out.println(instanceTwo.hashCode());
	}

}
