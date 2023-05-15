package com;

import org.springframework.stereotype.Component;

@Component
public class PriceMatrixImpl {
	
	public PriceMatrixImpl() {
		System.out.println(">> PriceMatrixImpl object created..");
	}
	
	
	
	public double getItemPrice(String itemId) {
		// code to connect to DB and fetch price of given item-id
		
		return 100.0;
	}

}
