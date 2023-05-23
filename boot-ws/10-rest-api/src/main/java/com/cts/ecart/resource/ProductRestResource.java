package com.cts.ecart.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.ecart.model.Product;
import com.cts.ecart.repository.ProductRepositoryImpl;

@RestController
@RequestMapping(value = "/api/products")
@CrossOrigin
public class ProductRestResource {
	
	
	@Autowired
	private ProductRepositoryImpl prodRepo;
	
	
	@GetMapping
	public List<Product> f1() {
		return prodRepo.loadProducts();
	}
	
	@GetMapping("/{id}")
	public Product f11(@PathVariable int id) {
		System.out.println(">> ID:: "+id);
		
		Product prod = prodRepo.findById(id);
		
		return prod;
		
		//return prodRepo.loadProducts().stream().findFirst().filter(prod->prod.getId()==id).orElse(null);
	}
	
	
	@PostMapping
	public String f2() {
		return "POST Mapping";
	}
	
	@PostMapping(value = "/save")
	public Product f22(@RequestBody Product prod) {
		System.out.println(prod);
		return prod;
	}
	
	@PutMapping
	public String f3() {
		return "PUT Mapping";
	}
	
	@PatchMapping
	public String f4() {
		return "PATCH Mapping";
	}
	
	@DeleteMapping
	public String f5() {
		return "DELETE Mapping";
	}

}
