package com.cts.ecart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication // enable auto discovery
public class Application {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context= SpringApplication.run(Application.class,args); // container
		//C1 c1Obj= (C1) context.getBean("c1");
		//C1 c1Obj = context.getBean("c1",C1.class);
		C1 c1Obj = context.getBean(C1.class);
		
		c1Obj.f1();
		
		
	}

}
