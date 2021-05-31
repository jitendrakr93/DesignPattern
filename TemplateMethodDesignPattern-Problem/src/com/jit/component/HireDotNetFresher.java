package com.jit.component;

public class HireDotNetFresher extends HireFresher {

	@Override
	public boolean conductTechnicalTest() {
		System.out.println("HireDotNetFresher Conducting DotNet technical Test");
		return true;
	}

	@Override
	public boolean conductCodingTest() {
		System.out.println("HireDotNetFresher Conducting DotNet coding Test");
		return true;
	}

}
