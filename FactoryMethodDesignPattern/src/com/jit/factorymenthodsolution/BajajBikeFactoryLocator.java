package com.jit.factorymenthodsolution;

public class BajajBikeFactoryLocator {

	public static BajajBikeFactory buildBikeFactory(String location) {
		if (location.equalsIgnoreCase("chennai"))
			return new BajajChennaiFactory();
		else if (location.equalsIgnoreCase("noida"))
			return new BajajNoidaFactory();
		else
			throw new IllegalArgumentException("Invalid location");
	}
}
