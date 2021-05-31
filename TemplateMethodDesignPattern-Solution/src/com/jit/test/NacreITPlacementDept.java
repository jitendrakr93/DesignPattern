package com.jit.test;

import com.jit.component.HireFresher;
import com.jit.factory.HireFresherFactory;

public class NacreITPlacementDept {

	public static void main(String[] args) {
		HireFresher javaFresher = HireFresherFactory.getInstance("java");
		boolean result = javaFresher.recruitFresher();
		if(result)
			System.out.println("Java Fresher is selected");
		else
			System.out.println("Java Fresher is not selected");
	}
}
