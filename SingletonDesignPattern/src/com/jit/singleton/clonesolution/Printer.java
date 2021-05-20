package com.jit.singleton.clonesolution;

public class Printer extends CommonUtils{

	private Printer() {
	}
	
	private static class InnerPrinter{
		public volatile static Printer printer=new Printer();
	}
	
	public static Printer getPrinterInstance() {
		return InnerPrinter.printer;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		//return InnerPrinter.printer;
		throw new CloneNotSupportedException("Clone not allowed");
	}
}
