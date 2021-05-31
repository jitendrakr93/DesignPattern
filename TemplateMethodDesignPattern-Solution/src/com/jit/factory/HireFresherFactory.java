package com.jit.factory;

import com.jit.component.HireDotNetFresher;
import com.jit.component.HireFresher;
import com.jit.component.HireJavaFresher;
import com.jit.component.HireUIFresher;

public class HireFresherFactory {

	public static HireFresher getInstance(String fresherType) {
		if(fresherType.equalsIgnoreCase("java"))
			return new HireJavaFresher();
		else if(fresherType.equalsIgnoreCase("dotNet"))
			return new HireDotNetFresher();
		else if(fresherType.equalsIgnoreCase("ui"))
			return new HireUIFresher();
		else
			throw new IllegalArgumentException("As of now we are not recruiting "+fresherType+ " fresher");
			
		
	}
}
