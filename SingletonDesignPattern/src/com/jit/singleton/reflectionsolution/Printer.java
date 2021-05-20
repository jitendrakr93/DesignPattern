package com.jit.singleton.reflectionsolution;

public class Printer {

	private static final Long serialVersionUID = 4234244L;

	private Printer() {
		if(InnerPrinter.printer !=null)
			throw new RuntimeException("Object is already created");
	}

	private static class InnerPrinter {
		private static volatile Printer printer = new Printer();
	}

	public static Printer getPrinterInstance() {
		return InnerPrinter.printer;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Clone not supported");
	}

	public Object readResolve() {
		throw new IllegalArgumentException("Deserialization not allowed");
	}
}
