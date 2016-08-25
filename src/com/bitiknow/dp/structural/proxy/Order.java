package com.bitiknow.dp.structural.proxy;

public class Order {

	private String orderName;
	private String orderAddress;
	private int orderId;
	private int orderAmount;

	public Order() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param orderName
	 * @param orderAddress
	 * @param orderId
	 * @param orderAmount
	 */
	public Order(String orderName, String orderAddress, int orderId, int orderAmount) {
		this.orderName = orderName;
		this.orderAddress = orderAddress;
		this.orderId = orderId;
		this.orderAmount = orderAmount;
	}

	/**
	 * @return the orderName
	 */
	public final String getOrderName() {
		return orderName;
	}

	/**
	 * @param orderName
	 *            the orderName to set
	 */
	public final void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	/**
	 * @return the orderAddress
	 */
	public final String getOrderAddress() {
		return orderAddress;
	}

	/**
	 * @param orderAddress
	 *            the orderAddress to set
	 */
	public final void setOrderAddress(String orderAddress) {
		this.orderAddress = orderAddress;
	}

	/**
	 * @return the orderId
	 */
	public final int getOrderId() {
		return orderId;
	}

	/**
	 * @param orderId
	 *            the orderId to set
	 */
	public final void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	/**
	 * @return the orderAmount
	 */
	public final int getOrderAmount() {
		return orderAmount;
	}

	/**
	 * @param orderAmount
	 *            the orderAmount to set
	 */
	public final void setOrderAmount(int orderAmount) {
		this.orderAmount = orderAmount;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Order [" + (orderName != null ? "orderName=" + orderName + ", " : "")
				+ (orderAddress != null ? "orderAddress=" + orderAddress + ", " : "") + "orderId=" + orderId
				+ ", orderAmount=" + orderAmount + "]";
	}

}
