package com.jit.test;

import com.jit.comp.ButterScotchIceCream;
import com.jit.comp.IceCream;
import com.jit.comp.VanilaIceCream;
import com.jit.decorator.ChocohipsDecorator;
import com.jit.decorator.DryFruitDecorator;
import com.jit.decorator.HoneyDecorator;

public class DecoratorDPTest2 {

	public static void main(String[] args) {
		IceCream ice1 = new ButterScotchIceCream();
		ice1.prepare();
		System.out.println("----------------");
		IceCream ice2 = new DryFruitDecorator(new ButterScotchIceCream());
		ice2.prepare();
		System.out.println("----------------");
		IceCream ice3 = new DryFruitDecorator(new HoneyDecorator(new ButterScotchIceCream()));
		ice3.prepare();
		System.out.println("----------------");
		IceCream ice4 = new DryFruitDecorator(new HoneyDecorator(new ChocohipsDecorator(new ButterScotchIceCream())));
		ice4.prepare();
	}

}
