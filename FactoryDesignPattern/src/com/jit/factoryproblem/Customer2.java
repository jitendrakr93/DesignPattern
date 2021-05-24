package com.jit.factoryproblem;

public class Customer2 {

	public static void main(String[] args) {
		CarTyres tyres = new CarTyres();
		Car car = new BalenorCar(tyres);
		car.assemble();
		car.roadTest();
		System.out.println(car);

	}

}
