package com.bitiknow.dp.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name;
	private int salary;
	private String roles;
	private List<Employee> subordinates;

	public Employee(String name, String dept, int sal) {
		this.name = name;
		this.roles = dept;
		this.salary = sal;
		subordinates = new ArrayList<Employee>();
	}

	public void addEmployee(Employee employee) {
		subordinates.add(employee);
	}

	public void removeEmployee(Employee employee) {
		subordinates.remove(employee);
	}

	public List<Employee> getSubordinates() {
		return subordinates;
	}

	public String toString() {
		return ("Employee :[ Name : " + name + ", dept : " + roles + ", salary :" + salary + " ]");
	}
}
