package com.cts.ecart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component(value = "c1")
public class C1 {
	
	//@Value("${name}")
	//private String personName;
	//@Value("${myform.product.name}")
	//private String productName;
	//@Value("${myform.product.price}")
	//private double price;
	
	@Autowired
	private Environment env;
	
	

	
	public C1() {
		System.out.println(">> C1 class object created");
	}
	
	public void f1() {
		System.out.println("C1 class f1 method");
		System.out.println("Person name: "+env.getProperty("name"));
		//System.out.println("person name: "+personName);
		//System.out.println("product name: "+productName);
		//System.out.println("Price: "+price);
		System.out.println("=============================");
	}

}
