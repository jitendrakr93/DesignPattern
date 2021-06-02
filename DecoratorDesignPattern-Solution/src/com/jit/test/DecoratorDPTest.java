package com.jit.test;

import com.jit.comp.IceCream;
import com.jit.comp.VanilaIceCream;
import com.jit.decorator.ChocohipsDecorator;
import com.jit.decorator.DryFruitDecorator;
import com.jit.decorator.HoneyDecorator;

public class DecoratorDPTest {

	public static void main(String[] args) {
		IceCream ice1 = new VanilaIceCream();
		ice1.prepare();
		System.out.println("----------------");
		IceCream ice2 = new DryFruitDecorator(new VanilaIceCream());
		ice2.prepare();
		System.out.println("----------------");
		IceCream ice3 = new DryFruitDecorator(new HoneyDecorator(new VanilaIceCream()));
		ice3.prepare();
		System.out.println("----------------");
		IceCream ice4 = new DryFruitDecorator(new HoneyDecorator(new ChocohipsDecorator(new VanilaIceCream())));
		ice4.prepare();
	}

}
