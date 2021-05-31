package com.jit.component;

public abstract class HireFresher {
	public boolean conductAptitudeTest() {
		System.out.println("Conducting Aptitude Test for fresher");
		return true;
	}
	
	public boolean conductGDTest() {
		System.out.println("Conducting GD Test for Fresher");
		return true;
	}
	
	public abstract boolean conductTechnicalTest();
	public abstract boolean conductCodingTest();
	
	public boolean conductHRTest() {
		System.out.println("Conducting HR Test for Fresher");
		return true;
	}
	
}
