package com.jit.factorymenthodproblem;

public class NorthCustomer {

	public static void main(String[] args) {
		BajajBike bike = BajajNoidaFactory.createBike("pulsar");
		bike.drive();

	}

}
