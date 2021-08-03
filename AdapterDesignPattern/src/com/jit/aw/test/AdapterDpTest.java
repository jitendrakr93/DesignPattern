package com.jit.aw.test;

import com.aw.service.AcuuWeatherServiceImpl;
import com.jit.aw.service.AcuuWeatherService;

public class AdapterDpTest {
	public static void main(String[] args) {
		// create Service class object
		AcuuWeatherService service = new AcuuWeatherServiceImpl();

		// Invoke method
		try {
			System.out.println(service.showTemperature("hyd"));
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		System.out.println("==============================");

		try {
			System.out.println(service.showTemperature("delhi"));
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		System.out.println("==============================");

		try {
			System.out.println(service.showTemperature("mumbai"));
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		System.out.println("==============================");

	}
}
