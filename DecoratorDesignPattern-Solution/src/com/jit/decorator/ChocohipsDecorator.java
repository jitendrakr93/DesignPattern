package com.jit.decorator;

import com.jit.comp.IceCream;

public class ChocohipsDecorator extends IcecreamDecorator {

	public ChocohipsDecorator(IceCream icecream) {
		super(icecream);
	}

	@Override
	public void prepare() {
		super.prepare();
		addChocoChips();
	}

	public void addChocoChips() {
		System.out.println("adding ChocoChips");
	}

}
