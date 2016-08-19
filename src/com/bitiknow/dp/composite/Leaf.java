package com.bitiknow.dp.composite;

public class Leaf implements Component {
	private String name;
	private int salary;

	public Leaf(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	@Override
	public void printName() {
		System.out.println(name);

	}

	@Override
	public void printSalary() {
		System.out.println(salary);
	}

}
