/**
 * 
 */
package com.bitiknow.dp.structural.proxy;

/**
 * @author pradeep
 *
 */
public class ProxyOrderManipulationImpl implements OrderManipulation {
	OrderManipulationImpl orderManipulationImpl;
	private Order order;

	public ProxyOrderManipulationImpl(Order order) {
		order = this.order;
	}

	@Override
	public Order modifyOrderAddress(String newAddress) {
		return orderManipulationImpl.modifyOrderAddress(newAddress);
	}

	@Override
	public int deleteOrder() {
		return orderManipulationImpl.deleteOrder();
	}

	@Override
	public void viewOrder(Order order) {

		if (orderManipulationImpl == null) {
			orderManipulationImpl = new OrderManipulationImpl(order);
		}
		orderManipulationImpl.viewOrder(order);

	}

}
