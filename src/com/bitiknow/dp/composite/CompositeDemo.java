package com.bitiknow.dp.composite;

public class CompositeDemo {
	public static void main(String[] args) {
		Leaf CEO = new Leaf("Ginni", 90);

		Leaf Leader = new Leaf("Pramod", 80);
		Leaf Director = new Leaf("Avijit", 80);
		Leaf Director1 = new Leaf("Manas", 80);

		Leaf Manager = new Leaf("Deepesh", 70);
		Leaf Manager1 = new Leaf("Rajiv", 70);

		Leaf Raj = new Leaf("Raj", 60);
		Leaf Pradeep = new Leaf("Pradeep", 60);
		Leaf Pankaj = new Leaf("Pankaj", 60);
		Leaf Gaurava = new Leaf("Gaurava", 50);

		Composite Deepesh = new Composite();
		Deepesh.add(Manager);
		Deepesh.add(Pradeep);
		Deepesh.add(Raj);

		Composite Rajiv = new Composite();
		Rajiv.add(Manager1);
		Rajiv.add(Pankaj);
		Rajiv.add(Gaurava);

		Composite Manas = new Composite();
		Manas.add(Director1);
		Manas.add(Deepesh);
		Manas.add(Rajiv);

		Composite Pramod = new Composite();
		Pramod.add(Leader);
		Pramod.add(Manas);
		Pramod.add(Director);

		Composite Ginni = new Composite();
		Ginni.add(CEO);
		Ginni.add(Pramod);

		Ginni.printName();

	}

}
