package com.jit.factorymenthodsolution;

public class SouthCustomer {

	public static void main(String[] args) {
		BajajBikeFactory factory = BajajBikeFactoryLocator.buildBikeFactory("chennai");
		BajajBike bike = factory.orderBike("pulsar");
		bike.drive();

	}
}
