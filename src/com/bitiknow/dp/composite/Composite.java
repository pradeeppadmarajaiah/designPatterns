package com.bitiknow.dp.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
	List<Component> components = new ArrayList<Component>();
	
	@Override
	public void printName() {
		for (Component component : components) {
			component.printName();
		}
	}

	@Override
	public void printSalary() {
		for (Component component : components) {
			component.printSalary();
		}

	}

	public void add(Component component) {
		components.add(component);
	}

	public void remove(Component component) {
		components.remove(component);
	}

	public List<Component> getComponents() {
		return components;
	}

	public Component getComponent(int index) {
		return components.get(index);
	}

}
