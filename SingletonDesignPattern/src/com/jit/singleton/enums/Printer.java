package com.jit.singleton.enums;

public enum Printer {
	INSTANCE;
	
	public static Printer getPrinterInstance() {
		return INSTANCE;
	}
}
