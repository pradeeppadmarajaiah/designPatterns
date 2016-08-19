package com.bitiknow.dp.creational.builder;

public class RedCarBuilder implements CarBuilder {
	private Car car;

	public RedCarBuilder() {
		car = new Car();
	}

	@Override
	public void buildView() {
		car.setColor("RED");
		car.setWheels(4);

	}

	@Override
	public Car getResult() {
		return car;
	}

}
