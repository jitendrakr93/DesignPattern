package com.jit.builder;

import com.jit.product.ConcreteBasement;
import com.jit.product.ConcreteRoof;
import com.jit.product.ConcreteStructure;
import com.jit.product.GlassInterior;
import com.jit.product.House;
import com.jit.product.WoodenBasement;
import com.jit.product.WoodenInterior;
import com.jit.product.WoodenRoof;
import com.jit.product.WoodenStructure;

public class ConcreteHouseBuilder implements IHouseBuilder {

	private House house;

	public ConcreteHouseBuilder(House house) {
		System.out.println("ConcreteHouseBuilder :: 1-param constructor");
		this.house = house;
	}

	@Override
	public void constructRoof() {
		house.setRoof(new ConcreteRoof());
	}

	@Override
	public void constructBasement() {
		house.setBasement(new ConcreteBasement());

	}

	@Override
	public void constructStructure() {
		house.setStructure(new ConcreteStructure());
	}

	@Override
	public void constructInterior() {
		house.setInterior(new GlassInterior());
	}

	@Override
	public House getHouse() {
		return house;
	}

}
