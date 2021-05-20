package com.jit.singleton.cloneproblem;

public class Printer extends CommonUtils{

	private Printer() {
	}
	
	private static class InnerPrinter{
		public volatile static Printer printer=new Printer();
	}
	
	public static Printer getPrinterInstance() {
		return InnerPrinter.printer;
	}
}
