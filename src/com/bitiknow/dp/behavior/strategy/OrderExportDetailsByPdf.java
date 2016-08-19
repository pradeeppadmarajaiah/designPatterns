/**
 * 
 */
package com.bitiknow.dp.behavior.strategy;

/**
 * @author pradeep
 *
 */
public class OrderExportDetailsByPdf implements OrderExportStrategy {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.bitiknow.dp.behavior.strategy.OrderExportStrategy#orderExecution(int,
	 * int)
	 */
	@Override
	public void orderExportExecution() {
		System.out.println("Order export details are generated in PDF format");

	}

}
