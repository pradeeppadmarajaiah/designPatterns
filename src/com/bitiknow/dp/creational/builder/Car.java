package com.bitiknow.dp.creational.builder;

public class Car {
	private int wheels;
	private String color;

	/**
	 * @return the wheels
	 */
	public final int getWheels() {
		return wheels;
	}

	/**
	 * @param wheels
	 *            the wheels to set
	 */
	public final void setWheels(int wheels) {
		this.wheels = wheels;
	}

	/**
	 * @return the color
	 */
	public final String getColor() {
		return color;
	}

	/**
	 * @param color
	 *            the color to set
	 */
	public final void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Car [wheels=" + wheels + ", color=" + color + "]";
	}
}
