package com.bitiknow.dp.structural.proxy;

public class OrderManipulationImpl implements OrderManipulation {
	private Order order;

	public OrderManipulationImpl(Order order) {
		order = this.order;
		System.out.println("Creating order.");
	}

	@Override
	public Order modifyOrderAddress(String newAddress) {
		order.setOrderAddress(newAddress);
		return order;
	}

	@Override
	public int deleteOrder() {
		int orderId = order.getOrderId();
		order = null;
		return orderId;
	}

	@Override
	public void viewOrder(Order order) {
		System.out.println("======Start========");
		System.out.println(order.getOrderName());
		System.out.println(order.getOrderAddress());
		System.out.println("=======END=======");

	}

}
