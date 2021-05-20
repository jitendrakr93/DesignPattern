package com.jit.singleton;

public class Printer5 {


	private static class InnerPrinter {
		private static volatile Printer5 printerInstance = new Printer5();

	}

	private Printer5() {

	}

	public static Printer5 getPrinterInstance() {
		return InnerPrinter.printerInstance;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		//return InnerPrinter.printerInstance;
		throw new CloneNotSupportedException("Clone not allowed");
	}
	public void printData() {
		System.out.println("SINGLETON :: PRINT1");
	}

}
