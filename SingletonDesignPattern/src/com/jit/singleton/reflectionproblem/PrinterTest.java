package com.jit.singleton.reflectionproblem;

import java.lang.reflect.Constructor;
import java.util.Arrays;

public class PrinterTest {

	public static void main(String[] args) {
		Printer p1 = Printer.getPrinterInstance();
		try {
			Class c = p1.getClass();
			Constructor cons[] = c.getDeclaredConstructors();
			cons[1].setAccessible(true);
			Printer p2 = (Printer) cons[1].newInstance();
			Printer p3 = (Printer) cons[1].newInstance();
			System.out.println("Objects are created using reflection API");
			System.out.println(p1.hashCode() + " " + p2.hashCode() + " " + p3.hashCode());
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
