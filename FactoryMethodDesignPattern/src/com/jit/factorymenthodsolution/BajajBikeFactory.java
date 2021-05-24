package com.jit.factorymenthodsolution;

public abstract class BajajBikeFactory {

	public abstract void paint();

	public abstract void assemble();

	public abstract void oiling();

	public abstract void roadTest();

	public abstract BajajBike createBike(String type);

	// method having Factory Method Design Pattern logic
	public BajajBike orderBike(String type) {
		paint();
		assemble();
		oiling();
		roadTest();
		BajajBike bike = createBike(type);
		return bike;
	}
}
