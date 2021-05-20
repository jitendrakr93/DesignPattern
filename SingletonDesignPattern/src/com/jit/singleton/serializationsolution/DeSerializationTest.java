package com.jit.singleton.serializationsolution;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationTest {

	public static void main(String[] args) {

		try {
			ObjectInputStream oos = new ObjectInputStream(new FileInputStream("printer_data.ser"));
			Printer p =(Printer) oos.readObject();
			System.out.println("P object hashcode ::"+p.hashCode());
			p.getMessage();
			oos.close();
			System.out.println("Deserialization done");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}