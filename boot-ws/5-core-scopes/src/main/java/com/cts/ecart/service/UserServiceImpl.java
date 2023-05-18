package com.cts.ecart.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.cts.ecart.model.Product;

@Service
@Lazy // default value is true
//@Primary
public class UserServiceImpl implements ProductService{
	
	public UserServiceImpl() {
		System.out.println(">> UserServiceImpl object created..");
	}

	@Override
	public void save(Product product) {
		System.out.println("user-service");
		
	}

}
