package com.jit.test;

import com.jit.component.HireFresher;
import com.jit.component.HireJavaFresher;
import com.jit.component.HireUIFresher;

public class NacreITPlacementDept {

	public static void main(String[] args) {
		HireFresher uiFresher = new HireUIFresher();
		boolean result = uiFresher.conductAptitudeTest();
		if (result)
			result = uiFresher.conductHRTest();
		
		if (result)
			result = uiFresher.conductGDTest();
		
		if (result)
			result = uiFresher.conductTechnicalTest();
		
		if (result)
			System.out.println("UI Fresher is selected");
		else
			System.out.println("UI fresher is not selected");
	}
}
