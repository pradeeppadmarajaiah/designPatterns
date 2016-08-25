package com.bitiknow.dp.structural.proxy;

public interface OrderManipulation {

	Order modifyOrderAddress(String newAddress);

	int deleteOrder();

	void viewOrder(Order order);

}
