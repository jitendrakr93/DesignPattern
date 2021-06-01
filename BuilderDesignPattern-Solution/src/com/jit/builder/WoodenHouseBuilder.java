package com.jit.builder;

import com.jit.product.ConcreteBasement;
import com.jit.product.ConcreteRoof;
import com.jit.product.House;
import com.jit.product.IronStructure;
import com.jit.product.MixedInterior;
import com.jit.product.WoodenBasement;
import com.jit.product.WoodenInterior;
import com.jit.product.WoodenRoof;
import com.jit.product.WoodenStructure;

public class WoodenHouseBuilder implements IHouseBuilder {

	private House house;

	public WoodenHouseBuilder(House house) {
		System.out.println("WoodenHouseBuilder :: 1-param constructor");
		this.house = house;
	}

	@Override
	public void constructRoof() {
		house.setRoof(new WoodenRoof());
	}

	@Override
	public void constructBasement() {
		house.setBasement(new WoodenBasement());

	}

	@Override
	public void constructStructure() {
		house.setStructure(new WoodenStructure());
	}

	@Override
	public void constructInterior() {
		house.setInterior(new WoodenInterior());
	}

	@Override
	public House getHouse() {
		return house;
	}

}
