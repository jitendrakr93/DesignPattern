package com.jit.builder;

import com.jit.product.House;
import com.jit.product.IceBasement;
import com.jit.product.IceCarvingInterior;
import com.jit.product.IceRoof;
import com.jit.product.IceStructure;
import com.jit.product.WoodenBasement;
import com.jit.product.WoodenInterior;
import com.jit.product.WoodenRoof;
import com.jit.product.WoodenStructure;

public class IglouHouseBuilder implements IHouseBuilder {

	private House house;

	public IglouHouseBuilder(House house) {
		System.out.println("IglouHouseBuilder :: 1-param constructor");
		this.house = house;
	}

	@Override
	public void constructRoof() {
		house.setRoof(new IceRoof());
	}

	@Override
	public void constructBasement() {
		house.setBasement(new IceBasement());

	}

	@Override
	public void constructStructure() {
		house.setStructure(new IceStructure());
	}

	@Override
	public void constructInterior() {
		house.setInterior(new IceCarvingInterior());
	}

	@Override
	public House getHouse() {
		return house;
	}

}
