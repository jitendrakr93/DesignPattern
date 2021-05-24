package com.jit.singleton.serializationsolution;

public class Printer extends CommonUtils {

	private static final Long serialVersionUID = 4234244L;

	private Printer() {
		// TODO Auto-generated constructor stub
	}

	private static class InnerPrinter {
		public volatile static Printer printer = new Printer();
	}

	public static Printer getPrinter() {
		return InnerPrinter.printer;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Clone not allowed");
	}

	public Object readResolve() {
		 return InnerPrinter.printer;
		//throw new IllegalArgumentException("Deserialization is not allowed");
	}

	public void getMessage() {
		System.out.println("Hello");
	}

}
