package com.jit.factorysolution;

public class SwiftCar implements Car{

	private CarTyres tyres;
	
	public SwiftCar(CarTyres tyres) {
		System.out.println("SwiftCar  :: 1 param constructor");
		this.tyres = tyres;
	}
	@Override
	public void assemble() {
		System.out.println("SwiftCar is assembled");
		
	}

	@Override
	public void roadTest() {
		System.out.println("SwiftCar is road tested");
	}
	@Override
	public String toString() {
		return "SwiftCar with [tyres=" + tyres + "]";
	}
	
	

}
