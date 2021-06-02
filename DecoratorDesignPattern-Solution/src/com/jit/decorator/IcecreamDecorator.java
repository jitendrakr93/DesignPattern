package com.jit.decorator;

import com.jit.comp.IceCream;

public abstract class IcecreamDecorator implements IceCream {

	private IceCream icecream;

	public IcecreamDecorator(IceCream icecream) {
		this.icecream = icecream;
	}

	@Override
	public void prepare() {
		icecream.prepare();
	}

}
