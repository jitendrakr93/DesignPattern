package com.jit.singleton.clonesolution;

public class CloneTest {

	public static void main(String[] args) {
		Printer p1 = Printer.getPrinterInstance();
		try {
			Printer p2 = (Printer) p1.clone();
			System.out.println("Cloned object is created");
			System.out.println(p1.hashCode()+" <----------> "+p2.hashCode());	
			System.out.println("p1 == p2 : "+(p1 == p2));
		}catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}

}
