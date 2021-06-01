package com.jit.product;

public class ConcreteBasement implements IBasement{

	public ConcreteBasement() {
		System.out.println("ConcreteBasement :: 0-param constructor");
	}

	@Override
	public String toString() {
		return "ConcreteBasement []";
	}
	
	
}
