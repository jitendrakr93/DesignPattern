package com.jit.factorymenthodproblem;

public class BajajChennaiFactory {

	public static void paint() {
		System.out.println("Painting bajaj bike");
	}

	public static void assemble() {
		System.out.println("Assembling bajaj bike");
	}

	public static void roadTest() {
		System.out.println("Road testing bajaj bike");
	}

	public static void oiling() {
		System.out.println("Oiling of bajaj bike");
	}

	// factory method
	public static BajajBike createBike(String type) {
		BajajBike bike = null;
		if (type.equalsIgnoreCase("discover"))
			bike = new BajajDiscover();
		else if (type.equalsIgnoreCase("platina"))
			bike = new BajajPlatina();
		else if (type.equalsIgnoreCase("pulsar"))
			bike = new BajajPulsar();
		else
			throw new IllegalArgumentException("Invalid bike type");
		
		paint();
		assemble();
		oiling();
		roadTest();
		return bike;
	}
}
