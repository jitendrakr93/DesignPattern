package com.jit.factorysolutionwithenum;

public class CarFactory {

	public static Car getCar(CarType type) {
		Car car = null;
		CarTyres tyres = new CarTyres();
		if (type == type.BALENO) {
			car = new BalenorCar(tyres);
		}
		if (type == type.SWIFT) {
			car = new SwiftCar(tyres);
		} else if (type == type.ERTIGA) {
			car = new ErtigaCar(tyres);
		} else {
			throw new IllegalArgumentException("Invalid car type");
		}
		car.assemble();
		car.roadTest();
		return car;
	}
}
