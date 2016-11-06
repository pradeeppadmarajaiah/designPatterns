package com.bitiknow.dp.structural.facade;

public class CoffeeProcedureFacade {

	CoffeeItem coffeeItem;
	ElectricStove electricStove;

	public CoffeeProcedureFacade() {
		this.coffeeItem = new CoffeeItem();
		this.electricStove = new ElectricStove();
	}

	public void prepareCoffee() {
		System.out.println("=======Start=====");
		electricStove.switchOnHeater();
		coffeeItem.getVessel();
		coffeeItem.getSugar();
		coffeeItem.getMilk();
		System.out.println("Heat up for 5 min.");
		coffeeItem.getCoffePowder();
		System.out.println("Stir it");
		coffeeItem.getMug();
		electricStove.switchOFFHeater();
		System.out.println("===End===");
	}

}
