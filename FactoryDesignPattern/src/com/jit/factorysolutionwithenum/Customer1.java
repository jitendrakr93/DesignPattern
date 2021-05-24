package com.jit.factorysolutionwithenum;

public class Customer1 {

	public static void main(String[] args) {
		Car car1 = CarFactory.getCar(CarType.BALENO);
		System.out.println(car1);
	}

}
