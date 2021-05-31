package com.jit.test;

import com.jit.component.HireFresher;
import com.jit.component.HireJavaFresher;

public class NareshITPlacementDept {

	public static void main(String[] args) {
		HireFresher javaFresher = new HireJavaFresher();
		boolean result = javaFresher.conductAptitudeTest();
		if(result)
			result=javaFresher.conductGDTest();
		if(result)
			result=javaFresher.conductTechnicalTest();
		if(result)
			result=javaFresher.conductCodingTest();
		if(result)
			result=javaFresher.conductHRTest();
		if(result)
			System.out.println("Java Fresher is selected");
		else
			System.out.println("Java fresher is not selected");
	}
}
