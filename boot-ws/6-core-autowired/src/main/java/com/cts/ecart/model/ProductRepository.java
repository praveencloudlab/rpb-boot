package com.cts.ecart.model;

import java.util.List;

public interface ProductRepository {

	Product save(Product product);

	List<Product> saveAll(List<Product> products);

	Product findById(int productId);

	List<Product> findAll();

	Product update(Product product);

	void deleteById(int productId);

}