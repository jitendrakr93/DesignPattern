package com.jit.singleton.serializationsolution;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationTest {

	public static void main(String[] args) {

		try {
			Printer p1 = Printer.getPrinter();
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("printer_data.ser"));
			oos.writeObject(p1);
			oos.flush();
			oos.close();
			System.out.println("Serialization is done");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}