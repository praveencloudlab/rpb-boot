package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BillingImpl {
	
	
	
	
	private PriceMatrixImpl price; //dependency class reference
	

	public BillingImpl(PriceMatrixImpl price) {
		this.price = price;
	}

	public double getCartTotal(String cart[]) {
		
		double total=0.0;
		
		//PriceMatrixImpl price=new PriceMatrixImpl(); //dependency
		
		for(String itemId:cart) {
			total=total+price.getItemPrice(itemId);
		}
		
		return total;
	}

}
