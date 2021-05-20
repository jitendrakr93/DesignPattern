package com.jit.singleton.threadproblem;

public class Printer {

	private static Printer printerInstance;

	private Printer() {

	}

	public static Printer getPrinterInstance() {
		if (printerInstance == null)
			printerInstance = new Printer();
		return printerInstance;
	}

	public void printValue() {
		System.out.println("SINGLETON THREAD PROBLEM");
	}
}
