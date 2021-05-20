package com.jit.singleton;

public class Printer1 {

	private static Printer1 printerInstance;

	private Printer1() {

	}

	public static Printer1 getPrinterInstance() {
		if (printerInstance == null)
			printerInstance = new Printer1();
		return printerInstance;
	}

	public void printData() {
		System.out.println("SINGLETON :: PRINT1");
	}

}
