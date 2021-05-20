package com.jit.singleton.serializationproblem;

import java.io.Serializable;

public class CommonUtils implements Cloneable, Serializable {
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
