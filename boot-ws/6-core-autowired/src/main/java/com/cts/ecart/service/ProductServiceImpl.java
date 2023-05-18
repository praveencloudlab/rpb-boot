package com.cts.ecart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cts.ecart.model.Product;
import com.cts.ecart.model.ProductRepository;
import com.cts.ecart.repository.ProductOracleRepositoryImpl;

@Service
//dependent on database impl classes
public class ProductServiceImpl {
	
	/*
	 * autowire
	 * ===========
	 * 1.load requested dependency class from container
	 * 2.set loaded dependency class to the dependent class
	 * 3.when dependent loaded by getBean from any where,
	 *   it will be loading along with dependeny class set in
	 *   step 2 
	 */
	@Autowired
	@Qualifier(value = "productOracleRepositoryImpl")
	private ProductRepository oracleDao;
	
	public Product save(Product product) {
		System.out.println("Service:: sending product to DAO");
		return oracleDao.save(product);
	}
	
	
	

}
