package com.cts.ecart.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.cts.ecart.model.Product;

@Service
@Scope("prototype") // default scope is singleton
@Primary
public class ProductServiceImpl implements ProductService {
	
	public ProductServiceImpl() {
		System.out.println(">> ProductServiceImpl object created on "+this.hashCode());
	}
	
	@Override
	public void save(Product product) {
		System.out.println("Saving product: "+product.getProductName()+" by "+this.hashCode());
	}

}
