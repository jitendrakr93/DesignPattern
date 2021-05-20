package com.jit.singleton.loaderproblemandsolution;

public class Printer {

	private Printer() {
		if (InnerPrinter.printer != null)
			throw new RuntimeException("Object already created");
	}

	public static class InnerPrinter {
		private static volatile Printer printer = new Printer();
	}

	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Clone not allowed");
	}

	public Object readResolve() {
		return InnerPrinter.printer;
	}
	
	public static Printer getInstance() {
		return InnerPrinter.printer;
	}
}
