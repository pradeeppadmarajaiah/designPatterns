package com.bitiknow.dp.creational.builder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.bitiknow.dp.structural.proxy.Main;

/**
 * 
 * @author pradeep
 *
 */
public class CompanyBuilder {

	private String companyName;
	private String headQuaters;
	private String companyType;
	private int numberOfBranches;
	private int employeeStrength;
	private boolean cafeteriaAvailable;

	public CompanyBuilder() {
		// TODO Auto-generated constructor stub
	}

	public CompanyBuilder setCompanyName(String companyName) {
		this.companyName = companyName;
		return this;
	}

	public CompanyBuilder setHeadQuaters(String headQuaters) {
		this.headQuaters = headQuaters;
		return this;
	}

	public CompanyBuilder setCompanyType(String companyType) {
		this.companyType = companyType;
		return this;
	}

	public CompanyBuilder setemployeeStrengths(int employeeStrength) {
		this.employeeStrength = employeeStrength;
		return this;
	}

	public CompanyBuilder setNumberOfBranches(int numberOfBranches) {
		this.numberOfBranches = numberOfBranches;
		return this;
	}

	public CompanyBuilder isCafeteriaAvailable(String companyName) {
		this.companyName = companyName;
		return this;
	}

	/**
	 * Final object will be Map.
	 * 
	 * @return
	 */
	public Map<String, String> toMap() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("companyName", companyName);
		map.put("headQuaters", headQuaters);
		map.put("companyType", companyType);
		map.put("numberOfBranches", String.valueOf(numberOfBranches));
		map.put("employeeStrength", String.valueOf(employeeStrength));
		map.put("cafeteriaAvailable", String.valueOf(cafeteriaAvailable));
		return map;

	}

	/**
	 * Final object will be Set.
	 * 
	 * @return
	 */

	public Set<String> toSet() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("companyName", companyName);
		map.put("headQuaters", headQuaters);
		map.put("companyType", companyType);
		map.put("numberOfBranches", String.valueOf(numberOfBranches));
		map.put("employeeStrength", String.valueOf(employeeStrength));
		map.put("cafeteriaAvailable", String.valueOf(cafeteriaAvailable));
		return map.keySet();
	}

	public static void main(String[] args) {

		CompanyBuilder builder = new CompanyBuilder().setCompanyName("DP Associates").setCompanyType("E-Commerce")
				.setHeadQuaters("India").setNumberOfBranches(4).setemployeeStrengths(12);
		Set<String> list = builder.toSet();
		System.out.println(list);
		Map<String, String> map = builder.toMap();
		System.out.println(map);

	}

}
