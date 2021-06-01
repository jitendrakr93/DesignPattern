package com.jit.product;

public class IronStructure implements IStructure {
	public IronStructure() {
		System.out.println("IronStructure :: 0 param constructor");
	}

	@Override
	public String toString() {
		return "IronStructure []";
	}

}
