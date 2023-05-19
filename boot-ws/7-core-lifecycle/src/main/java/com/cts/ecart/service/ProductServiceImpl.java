package com.cts.ecart.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;

@Service
@Scope("singleton")
//@Scope("prototype")
//@Lazy(value = true) // none of bean life cycle methods work
@Lazy(value = false) // all life cycle including bean works
public class ProductServiceImpl {
	
	
	
	public ProductServiceImpl() {
		System.out.println("1.ProductServiceImpl object created on "+this.hashCode());
	}
	
	@PostConstruct
	public void f1() {
		System.out.println("2.PostConstruct :: f1 on "+this.hashCode());
	}
	
	@Bean
	 void f3() {
		System.out.println("3.Bean :: f3 on "+this.hashCode());
	}
	
	/*
	 * 1.new object gets created, incase of scope is prototype
	 * 2.bean will not work on lazy init
	 * 
	 */
	@Bean
	 void f4() {
		System.out.println("3.Bean :: f4 on "+this.hashCode());
	}
	
	
	
	

}
