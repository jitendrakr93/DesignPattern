package com.jit.component;

public class HireJavaFresher extends HireFresher {

	@Override
	public boolean conductTechnicalTest() {
		System.out.println("HireJavaFresher Conducting java technical Test");
		return true;
	}

	@Override
	public boolean conductCodingTest() {
		System.out.println("HireJavaFresher Conducting Java coding Test");
		return true;
	}

}
