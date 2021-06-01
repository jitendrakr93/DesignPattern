package com.jit.director;

import com.jit.builder.IHouseBuilder;
import com.jit.product.House;

public class CivilEngineer {

	private IHouseBuilder builder;

	public CivilEngineer(IHouseBuilder builder) {
		System.out.println("CivilEngineer :: 1 param constructor");
		this.builder = builder;
	}

	// builder design pattern main method :: Defining process to construct the
	// complex object
	public House buildHouse() {
		builder.constructBasement();
		builder.constructStructure();
		builder.constructRoof();
		builder.constructInterior();
		House house = builder.getHouse();
		return house;
	}

}
