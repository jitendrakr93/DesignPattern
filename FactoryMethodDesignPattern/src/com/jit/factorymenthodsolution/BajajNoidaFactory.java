package com.jit.factorymenthodsolution;

public class BajajNoidaFactory extends BajajBikeFactory{

	public  void paint() {
		System.out.println("Painting bajaj bike");
	}

	public  void assemble() {
		System.out.println("Assembling bajaj bike");
	}

	public  void roadTest() {
		System.out.println("Road testing bajaj bike");
	}

	public  void oiling() {
		System.out.println("Oiling of bajaj bike");
	}

	// factory method
	public  BajajBike createBike(String type) {
		BajajBike bike = null;
		if (type.equalsIgnoreCase("discover"))
			bike = new BajajDiscover();
		else if (type.equalsIgnoreCase("platina"))
			bike = new BajajPlatina();
		else if (type.equalsIgnoreCase("pulsar"))
			bike = new BajajPulsar();
		else
			throw new IllegalArgumentException("Invalid bike type");

		return bike;
	}
}
