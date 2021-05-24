package com.jit.factorymenthodsolution;

public class NorthCustomer {

	public static void main(String[] args) {
		BajajBikeFactory factory = BajajBikeFactoryLocator.buildBikeFactory("noida");
		BajajBike bike = factory.orderBike("pulsar");
		bike.drive();

	}

}
