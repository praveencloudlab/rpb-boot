package com;

//dependent
public class BillingImpl {
	
	/*
	 * ==================
	 * Design issues
	 * ==================
	 * 
	 * => too many dependency object creations
	 * 		-> memory management issues
	 * 		-> Performance goes down
	 * 
	 * why this issue happened?
	 * ============================
	 * => dependent class itself creating dependency object directly
	 * 
	 * what is the solution?
	 * =======================
	 * => do not create dependency object directly from the dependent class
	 * => try to get the dependency objects from the JNDI locations .. etc
	 * => location of JNDI is tightly coupled with dependent classes
	 * 
	 * what is the best solution?
	 * ==============================
	 * => do not create or use look up techniques like JNDI,
	 *    instead of ask some (container) to inject/pass: IoC (inversion of control) 
	 * 
	 * 
	 *  how to implement IoC?
	 *  =======================
	 * => IoC can be implemented using dependency injection technique.
	 * 
	 *  what is dependency injection (DI)?
	 *  =======================================
	 *  => Injecting/passing dependency object to the dependent object
	 *  note: always dependents needs dependencies
	 *  
	 *   how to implement DI: 2 ways
	 *   ==============================
	 *   1.setter based injection
	 *   2.constructor based injection
	 *   
	 *   1.setter based injection
	 *   ================================
	 *   1. create reference of dependency at dependent class level
	 *   2. generate setter method for above defined class reference
	 * 
	 * 
	 *  
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	private PriceMatrixImpl price; //dependency class reference
	
	
	public void setPrice(PriceMatrixImpl price) {
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
