package com.jit.factorysolution;

public class CarFactory {

	public static Car getCar(String type) {
		Car car = null;
		CarTyres tyres = new CarTyres();
		if (type.equalsIgnoreCase("baleno")) {
			car = new BalenorCar(tyres);
		} else if (type.equalsIgnoreCase("swift")) {
			car = new SwiftCar(tyres);
		} else if (type.equalsIgnoreCase("ertiga")) {
			car = new ErtigaCar(tyres);
		} else {
			throw new IllegalArgumentException("Invalid car type");
		}
		car.assemble();
		car.roadTest();
		return car;
	}
}
