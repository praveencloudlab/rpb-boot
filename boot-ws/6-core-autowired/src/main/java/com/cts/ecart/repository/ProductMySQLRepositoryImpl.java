package com.cts.ecart.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cts.ecart.model.Product;
import com.cts.ecart.model.ProductRepository;

@Repository
public class ProductMySQLRepositoryImpl implements ProductRepository{

	@Override
	public Product save(Product product) {
		System.out.println("MySQL DAO::Saving Product");
		return null;
	}

	@Override
	public List<Product> saveAll(List<Product> products) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product findById(int productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product update(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(int productId) {
		// TODO Auto-generated method stub
		
	}

}
