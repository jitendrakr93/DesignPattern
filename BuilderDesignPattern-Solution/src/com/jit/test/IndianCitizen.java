package com.jit.test;

import com.jit.factory.HouseFactory;
import com.jit.product.House;

public class IndianCitizen {
	public static void main(String[] args) {
		House house = HouseFactory.getInstance("concrete");
		System.out.println(house);
	}
}
