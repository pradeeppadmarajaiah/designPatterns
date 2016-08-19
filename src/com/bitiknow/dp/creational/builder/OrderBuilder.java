package com.bitiknow.dp.creational.builder;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Creating an Order Builder similar to Java 8 Collection Streams.
 * 
 * @author pradeep
 *
 */
public class OrderBuilder {
	private String customerName;
	private Date orderDate;
	private List<String> products = new ArrayList<>();
	private String shippingType;
	private String address;

	/**
	 * 
	 * @param customerName
	 * @param orderDate
	 * @param products
	 * @param shippingType
	 * @param address
	 */
	public OrderBuilder(String customerName, Date orderDate, List<String> products, String shippingType,
			String address) {
		this.customerName = customerName;
		this.orderDate = orderDate;
		this.products = products;
		this.shippingType = shippingType;
		this.address = address;
	}

	/**
	 * 
	 */
	public OrderBuilder() {

	}

	/**
	 * 
	 * @param customerName
	 * @return
	 */
	public OrderBuilder setCustomerName(String customerName) {
		this.customerName = customerName;
		return this;
	}

	/**
	 * 
	 * @param orderDate
	 * @return
	 */
	public OrderBuilder setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
		return this;
	}

	/**
	 * 
	 * @param products
	 * @return
	 */
	public OrderBuilder setProducts(List<String> products) {
		this.products = products;
		return this;
	}

	/**
	 * 
	 * @param shippingType
	 * @return
	 */
	public OrderBuilder setShippingType(String shippingType) {
		this.shippingType = shippingType;
		return this;
	}

	/**
	 * 
	 * @param address
	 * @return
	 */
	public OrderBuilder setAddress(String address) {
		this.address = address;
		return this;
	}

	/**
	 * 
	 * @return
	 */
	public OrderBuilder build() {
		return new OrderBuilder(customerName, orderDate, products, shippingType, address);
	}

	public static void main(String[] args) {
		List<String> products = new ArrayList<>();
		products.add("Amazon Kindle Fire");
		products.add("scjp 8");
		OrderBuilder orderBuilder = new OrderBuilder().setCustomerName("Pradeep").setOrderDate(new Date())
				.setProducts(products).setAddress("India").build();
		System.out.println("Order for " + orderBuilder.customerName + " created successfully.");
	}
}
