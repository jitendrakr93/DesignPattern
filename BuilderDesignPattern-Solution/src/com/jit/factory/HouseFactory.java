package com.jit.factory;

import com.jit.builder.ConcreteHouseBuilder;
import com.jit.builder.IHouseBuilder;
import com.jit.builder.IglouHouseBuilder;
import com.jit.builder.MarbleHouseBuilder;
import com.jit.builder.WoodenHouseBuilder;
import com.jit.director.CivilEngineer;
import com.jit.product.House;

public class HouseFactory {
	
	public static House getInstance(String type) {
		IHouseBuilder builder = null;
		House house = new House();
		if(type.equalsIgnoreCase("wooden")) {
			builder=new WoodenHouseBuilder(house);
		}
		else if(type.equalsIgnoreCase("ice")) {
			builder = new IglouHouseBuilder(house);
		}
		else if(type.equalsIgnoreCase("concrete")) {
			builder = new ConcreteHouseBuilder(house);
		}
		else if(type.equalsIgnoreCase("marble")) {
			builder = new MarbleHouseBuilder(house);
		}
		else {
			throw new IllegalArgumentException("Invalid house type");
		}
		//create director/delegator object
		CivilEngineer enginner = new CivilEngineer(builder);
		house = enginner.buildHouse();
		return house;
	}
}
