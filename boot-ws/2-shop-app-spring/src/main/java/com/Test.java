package com;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		String cart1[]= {"P01","P02","P03"};
		String cart2[]= {"P01","P02"};
		
		//==========================================
		
		ConfigurableApplicationContext contect=new AnnotationConfigApplicationContext(AppConfig.class);
		
		
		//PriceMatrixImpl price=new PriceMatrixImpl();//dependency
		//BillingImpl biller=new BillingImpl(); // dependent
		
		//biller.setPrice(price); // injecting/passing dependency object(price) to the dependent object (biller) is called dependency injection (DI)
		
		//==========================================
		
		
		// get what you want
		
		BillingImpl biller = contect.getBean(BillingImpl.class);
		
		
		
		double total = biller.getCartTotal(cart1);
		System.out.println("Cart1 total is "+total);
		
		total = biller.getCartTotal(cart2);
		System.out.println("Cart2 total is "+total);

		

	}

}
