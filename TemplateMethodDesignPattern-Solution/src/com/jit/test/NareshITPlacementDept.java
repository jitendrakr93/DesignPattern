package com.jit.test;

import com.jit.component.HireFresher;
import com.jit.factory.HireFresherFactory;

public class NareshITPlacementDept {

	public static void main(String[] args) {
		HireFresher uiFresher = HireFresherFactory.getInstance("ui");
		boolean result = uiFresher.recruitFresher();
		if (result)
			System.out.println("UI Fresher is selected");
		else
			System.out.println("UI Fresher is not selected");
	}
}
