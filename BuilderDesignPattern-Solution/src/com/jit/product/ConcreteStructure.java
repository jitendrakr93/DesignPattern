package com.jit.product;

public class ConcreteStructure implements IStructure {
	public ConcreteStructure() {
		System.out.println("ConcreteStructure :: 0 param constructor");
	}

	@Override
	public String toString() {
		return "ConcreteStructure []";
	}

}
