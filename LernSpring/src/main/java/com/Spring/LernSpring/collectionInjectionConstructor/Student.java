package com.Spring.LernSpring.collectionInjectionConstructor;

import java.util.List;

public class Student {

	int id;
	String name;
	List<String> Address;

	public Student(int id, String name, List<String> Address) {
		super();
		this.id = id;
		this.name = name;
		this.Address = Address;
	}

	public void show() {
		System.out.println(id + " " + name + " " + Address);
	}
}
