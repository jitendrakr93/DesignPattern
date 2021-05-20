package com.jit.singleton.serializationproblem;

public class Printer extends CommonUtils{

	private Printer() {
		// TODO Auto-generated constructor stub
	}
	
	private static class InnerPrinter {
		public volatile static Printer printer=new Printer();
	}
	
	public static Printer getPrinter() {
		return InnerPrinter.printer;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Clone not allowed");
	}
	
	public void getMessage() {
		System.out.println("Hello");
	}
}
