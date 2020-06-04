package com.Spring.LernSpring.constructorInjection;

public class ConstructorInjection {

	public ConstructorInjection() {
		System.out.println("Hello World");
	}

	public ConstructorInjection(int x) {
		System.out.println("Integer Value:"+x);
	}

	ConstructorInjection(String y) {
		System.out.println("String value:"+y);
	}
}
