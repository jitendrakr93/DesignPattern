package com.jit.singleton;

public class Printer4 {


	private static class InnerPrinter {
		private static volatile Printer4 printerInstance = new Printer4();

	}

	private Printer4() {

	}

	public static Printer4 getPrinterInstance() {
		return InnerPrinter.printerInstance;
	}

	public void printData() {
		System.out.println("SINGLETON :: PRINT1");
	}

}
