package com.jit.test;

import com.jit.factory.HouseFactory;
import com.jit.product.House;

public class AmericaCitizen {
	public static void main(String[] args) {
		House house = HouseFactory.getInstance("wooden");
		System.out.println(house);
	}
}
