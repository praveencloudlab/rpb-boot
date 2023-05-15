package com;

//dependency
public class PriceMatrixImpl {
	
	public PriceMatrixImpl() {
		System.out.println(">> PriceMatrixImpl object created..");
	}
	
	/*
	 * two types
	 * ============
	 * 	1.dependency: works independently. never depends on other objects
	 * 	2.dependent : always depends on dependency. 
	 * 
	 */
	
	public double getItemPrice(String itemId) {
		// code to connect to DB and fetch price of given item-id
		
		return 100.0;
	}

}
