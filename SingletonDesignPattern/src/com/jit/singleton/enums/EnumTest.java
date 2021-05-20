package com.jit.singleton.enums;

public class EnumTest {

	public static void main(String[] args) {
		Printer p1 = Printer.getPrinterInstance();
		Printer p2 = Printer.getPrinterInstance();
		System.out.println(p1.hashCode()+" "+p2.hashCode());
	}

}
