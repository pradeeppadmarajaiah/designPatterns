package com.bitiknow.dp.structural.composite;

public class CompositePattern {
	public static void main(String[] args) {
		Employee CEO = new Employee("Ginni", "CEO", 9000000);

		Employee Pramod = new Employee("Pramod", "Leader", 8000000);
		Employee Nancy = new Employee("Nancy", "Leader", 8000000);
		CEO.addEmployee(Pramod);
		CEO.addEmployee(Nancy);

		Employee Manas = new Employee("Manas", "Director", 7000000);
		Employee Avijit = new Employee("Avijit", "Director", 7000000);
		Pramod.addEmployee(Manas);
		Pramod.addEmployee(Avijit);

		Employee Deepesh = new Employee("Deepesh", "Senior Managaer", 6000000);
		Employee Rajiv = new Employee("Rajiv", "Senior Managaer", 6000000);
		Manas.addEmployee(Deepesh);
		Manas.addEmployee(Rajiv);

		Employee Irfan = new Employee("Irfan", "Managaer", 5000000);
		Employee Manish = new Employee("Manish", "Managaer", 5000000);
		Deepesh.addEmployee(Irfan);
		Deepesh.addEmployee(Manish);

		Employee Pradeep = new Employee("Pradeep", "Employee", 4000000);
		Employee Raj = new Employee("Raj", "Employee", 4000000);
		Employee Mouli = new Employee("Mouli", "Employee", 4000000);
		Employee Siva = new Employee("Siva", "Employee", 4000000);
		Employee Mani = new Employee("Mani", "Employee", 4000000);
		Employee Ram = new Employee("Ram", "Employee", 4000000);

		Manish.addEmployee(Pradeep);
		Manish.addEmployee(Raj);
		Manish.addEmployee(Mouli);
		Manish.addEmployee(Siva);
		Manish.addEmployee(Ram);
		Manish.addEmployee(Mani);

		for (Employee employee : CEO.getSubordinates()) {
			System.out.println(employee);
			for (Employee Demployee : employee.getSubordinates()) {
				System.out.println(Demployee);
			}
		}

	}

}
