/**
 * 
 */
package com.bitiknow.dp.behavior.strategy;

/**
 * @author pradeep
 *
 */
public class OrderExportDetailsByText implements OrderExportStrategy {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.bitiknow.dp.behavior.strategy.OrderExportStrategy#orderExecution(int,
	 * int)
	 */
	@Override
	public void orderExportExecution() {
		System.out.println("Order export details  are generated in plain TEXT file format");

	}

}
