package com.jit.builder;

import com.jit.product.ConcreteBasement;
import com.jit.product.ConcreteRoof;
import com.jit.product.House;
import com.jit.product.IronStructure;
import com.jit.product.MixedInterior;

public class MarbleHouseBuilder implements IHouseBuilder {

	private House house;

	public MarbleHouseBuilder(House house) {
		System.out.println("MarbleHouseBuilder :: 1-param constructor");
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
		house.setStructure(new IronStructure());
	}

	@Override
	public void constructInterior() {
		house.setInterior(new MixedInterior());
	}

	@Override
	public House getHouse() {
		return house;
	}

}
