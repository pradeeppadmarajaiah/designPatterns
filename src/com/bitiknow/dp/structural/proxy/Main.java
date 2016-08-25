package com.bitiknow.dp.structural.proxy;

public class Main {
	public static void main(String[] args) {
		Order order = new Order("orderPradeep", "India", 1, 120);
		ProxyOrderManipulationImpl manipulationImpl = new ProxyOrderManipulationImpl(order);
		manipulationImpl.viewOrder(order);
		manipulationImpl.viewOrder(order);
	}

}
