package com.jit.factoryproblem;

public class Customer1 {

	public static void main(String[] args) {
		CarTyres tyres = new CarTyres();
		Car car = new SwiftCar(tyres);
		car.assemble(); 
		car.roadTest();
		System.out.println(car);

	}

}
