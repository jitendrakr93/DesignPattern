package com.jit.singleton;

public class Test {

	public static void main(String[] args) {
		Printer1 p1 = Printer1.getPrinterInstance();
		Printer1 p2 = Printer1.getPrinterInstance();
		
		System.out.println("p1 == p2 :: "+(p1 == p2));
		System.out.println(p1.hashCode()+" <===> "+p2.hashCode());
	}

}
