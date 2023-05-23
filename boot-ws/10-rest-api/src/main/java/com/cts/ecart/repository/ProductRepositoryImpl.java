package com.cts.ecart.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cts.ecart.model.Product;
@Repository
public class ProductRepositoryImpl {
	
	private static List<Product> products=new ArrayList<>();
	
	static {
		products=new ArrayList<>();
		products.add(new Product(10, "Pen", 45));
		products.add(new Product(11, "Book", 1243));
		products.add(new Product(12, "Mouse", 3500));
		products.add(new Product(13, "Laptop", 65000));
		products.add(new Product(14, "Mobile", 34000));
		
	}
	
	public Product findById(int id) {
		return products.stream().filter(prod->prod.getId()==id).findFirst().orElse(null);
	}
	
	public List<Product> loadProducts(){
		return products;
	}
	
	public Product save(Product product) {
		 products.add(product);
		 return product;
	}
	
	
	

}
