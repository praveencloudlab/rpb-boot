package com.cts.ecart.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cts.ecart.model.Product;
import com.cts.ecart.model.ProductRepository;

@Repository
public class ProductOracleRepositoryImpl implements ProductRepository {
	
	@Override
	public Product save(Product product) {
		System.out.println("Oracle DAO:: saving product "+product.getProductName());
		return product;
	}
	
	@Override
	public List<Product> saveAll(List<Product> products){
		return null;
	}
	
	@Override
	public Product findById(int productId) {
		return null;
	}
	
	@Override
	public List<Product> findAll(){
		return null;
	}
	
	@Override
	public Product update(Product product) {
		return null;
	}
	
	@Override
	public void deleteById(int productId) {
		
	}
	
	
	
	
	

}
