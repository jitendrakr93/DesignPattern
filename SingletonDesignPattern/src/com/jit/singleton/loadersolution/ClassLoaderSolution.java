package com.jit.singleton.loadersolution;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class ClassLoaderSolution {

	public static void main(String[] args) throws MalformedURLException, ClassNotFoundException, NoSuchMethodException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Printer p1 = Printer.getInstance();
		System.out.println("Class loader name " + p1.getClass().getClassLoader());
		URLClassLoader loader = new URLClassLoader(new URL[] { new URL("file:SDP.jar") }, p1.getClass().getClassLoader());

		Class<?> clazz = loader.loadClass("com.jit.singleton.loaderproblem.Printer");

		Method method = clazz.getDeclaredMethod("getInstance", new Class[] {});

		Object o1 = method.invoke(null);
		System.out.println("Class loader name " + o1.getClass().getClassLoader());
		System.out.println(p1.hashCode() + "    " + o1.hashCode());
	}

}
