package com.jit.test;

import com.jit.factory.HouseFactory;
import com.jit.product.House;

public class IceLandCitizen {
	public static void main(String[] args) {
		House house = HouseFactory.getInstance("ice");
		System.out.println(house);
	}
}
