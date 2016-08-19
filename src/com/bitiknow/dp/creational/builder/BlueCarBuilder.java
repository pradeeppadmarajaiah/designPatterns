/**
 * 
 */
package com.bitiknow.dp.creational.builder;

/**
 * @author pradeep
 *
 */
public class BlueCarBuilder implements CarBuilder {
	private Car car;

	public BlueCarBuilder() {
		car = new Car();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bitiknow.dp.creational.builder.CarBuilder#buildView()
	 */
	@Override
	public void buildView() {
		car.setColor("BLUE");
		car.setWheels(8);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bitiknow.dp.creational.builder.CarBuilder#getResult()
	 */
	@Override
	public Car getResult() {
		return car;
	}

}
