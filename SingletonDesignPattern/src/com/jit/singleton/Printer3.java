package com.jit.singleton;

public class Printer3 {

	private static volatile Printer3 printerInstance;

	private Printer3() {

	}

	public static Printer3 getPrinterInstance() {
		if (printerInstance == null) {
			synchronized (Printer3.class) {
				if (printerInstance == null) {
					printerInstance = new Printer3();
				}
			}
		}
		return printerInstance;
	}

	public void printData() {
		System.out.println("SINGLETON :: PRINT1");
	}

}
