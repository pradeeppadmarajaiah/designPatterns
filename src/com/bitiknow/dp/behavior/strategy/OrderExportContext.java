package com.bitiknow.dp.behavior.strategy;

public class OrderExportContext {

	OrderExportStrategy strategy;

	/**
	 * 
	 * @param strategy
	 */
	public OrderExportContext(OrderExportStrategy strategy) {
		this.strategy = strategy;
	}

	/**
	 * 
	 * @param strategy
	 */
	public void export() {
		strategy.orderExportExecution();
	}

}
