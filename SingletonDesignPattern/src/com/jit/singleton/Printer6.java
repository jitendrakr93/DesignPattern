package com.jit.singleton;

public class Printer6 {

	private static final Long serialVersionUID = 4234244L;

	private static class InnerPrinter {
		private static volatile Printer6 printerInstance = new Printer6();

	}

	private Printer6() {

	}

	public static Printer6 getPrinterInstance() {
		return InnerPrinter.printerInstance;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		// return InnerPrinter.printerInstance;
		throw new CloneNotSupportedException("Clone not allowed");
	}

	public Object readResolve() {
		// return InnerPrinter.printerInstance;
		throw new IllegalArgumentException("Deserialization is not allowed");
	}

	public void printData() {
		System.out.println("SINGLETON :: PRINT1");
	}

}
