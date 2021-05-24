package com.jit.factorysolution;

public class BalenorCar implements Car{

	private CarTyres tyres;
	
	public BalenorCar(CarTyres tyres) {
		System.out.println("BalenorCar :: 1 param constructor");
		this.tyres = tyres;
	}
	@Override
	public void assemble() {
		System.out.println("BalenorCar is assembled");
		
	}

	@Override
	public void roadTest() {
		System.out.println("BalenorCar is road tested");
	}
	@Override
	public String toString() {
		return "BalenorCar with [tyres=" + tyres + "]";
	}
	
	

}
