package com.jit.factorymenthodproblem;

public class SouthCustomer {

	public static void main(String[] args) {
		BajajBike bike = BajajChennaiFactory.createBike("pulsar");
		bike.drive();
	}
}
