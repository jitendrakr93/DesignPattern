package com.jit.singleton;

public class Printer2 {

	private static Printer2 printerInstance = new Printer2();

	private Printer2() {

	}

	public static Printer2 getPrinterInstance() {
		return printerInstance;
	}

	public void printData() {
		System.out.println("SINGLETON :: PRINT1");
	}

}
