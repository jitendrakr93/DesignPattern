package com.jit.decorator;

import com.jit.comp.IceCream;

public class DryFruitDecorator extends IcecreamDecorator {

	public DryFruitDecorator(IceCream icecream) {
		super(icecream);
	}

	@Override
	public void prepare() {
		super.prepare();
		addDryFruits();
	}

	public void addDryFruits() {
		System.out.println("adding DryFruits");
	}

}
