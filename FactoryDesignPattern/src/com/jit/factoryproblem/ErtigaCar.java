package com.jit.factoryproblem;

public class ErtigaCar implements Car {

	private CarTyres tyres;

	public ErtigaCar(CarTyres tyres) {
		System.out.println("ErtigaCar :: 1 param constructor");
		this.tyres = tyres;
	}

	@Override
	public void assemble() {
		System.out.println("ErtigaCar is assembled");

	}

	@Override
	public void roadTest() {
		System.out.println("ErtigaCar is road tested");
	}

	@Override
	public String toString() {
		return "ErtigaCar with [tyres=" + tyres + "]";
	}

}
