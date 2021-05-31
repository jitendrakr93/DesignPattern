package com.jit.component;

public class HireUIFresher extends HireFresher {

	@Override
	public boolean conductTechnicalTest() {
		System.out.println("HireUIFresher Conducting UI technical Test");
		return true;
	}

	@Override
	public boolean conductCodingTest() {
		System.out.println("HireUIFresher Conducting UI coding Test");
		return true;
	}

}
