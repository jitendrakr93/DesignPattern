package com.jit.factorysolutionwithenum;

public class Customer2 {

	public static void main(String[] args) {
		Car car1 = CarFactory.getCar(CarType.ERTIGA);
		System.out.println(car1);
	}

}
