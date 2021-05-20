package com.jit.singleton.loaderproblemandsolution;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class ClassLoaderProblemAndSolution {

	public static void main(String[] args) throws MalformedURLException, ClassNotFoundException, NoSuchMethodException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Printer p1 = Printer.getInstance();
		System.out.println("Class loader name " + p1.getClass().getClassLoader());
		URLClassLoader loader = new URLClassLoader(new URL[] { new URL("file:SDP.jar") }, null);

		Class<?> clazz = loader.loadClass("com.jit.singleton.loaderproblem.Printer");

		Method method = clazz.getDeclaredMethod("getInstance", new Class[] {});

		Object o1 = method.invoke(null);
		System.out.println("Class loader name " + o1.getClass().getClassLoader());
		System.out.println(p1.hashCode() + "    " + o1.hashCode());
		
		System.out.println("<===============Solution Code=======================================>");
		
		URLClassLoader loader1 = new URLClassLoader(new URL[] { new URL("file:SDP.jar") }, p1.getClass().getClassLoader());

		Class<?> clazz1 = loader1.loadClass("com.jit.singleton.loaderproblem.Printer");

		Method method1 = clazz1.getDeclaredMethod("getInstance", new Class[] {});

		Object o2 = method1.invoke(null);
		System.out.println("Class loader name " + o2.getClass().getClassLoader());
		System.out.println(p1.hashCode() + "    " + o2.hashCode());
	}

}
