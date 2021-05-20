package com.jit.singleton.threadsolution;

public class Printer {

	private static volatile Printer printerInstance;

	private Printer() {

	}

	public static Printer getPrinterInstance() {
		if (printerInstance == null) {
			synchronized (Printer.class) {
				if (printerInstance == null)
					printerInstance = new Printer();
			}
		}
		return printerInstance;
	}

	public void printValue() {
		System.out.println("SINGLETON THREAD PROBLEM");
	}
}
