package com.jit.decorator;

import com.jit.comp.IceCream;

public class HoneyDecorator extends IcecreamDecorator {

	public HoneyDecorator(IceCream icecream) {
		super(icecream);
	}

	@Override
	public void prepare() {
		super.prepare();
		addHoney();
	}

	public void addHoney() {
		System.out.println("adding Honey");
	}

}
