package com.cts.ecart;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.cts.ecart.entity.Brand;
import com.cts.ecart.entity.Category;
import com.cts.ecart.repository.BrandRepository;
import com.cts.ecart.repository.CategoryRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ac = SpringApplication.run(Application.class, args);
		BrandRepository brandRepo = ac.getBean(BrandRepository.class);
		CategoryRepository categoryRepo = ac.getBean(CategoryRepository.class);
		//brandRepo.findAll().forEach(brand->{
		//	System.out.println(brand);
		//});
		
		//brandRepo.findAll().forEach(System.out::println);
		
		/*
		Brand brand= brandRepo.findById(154).orElse(null);
		if(brand!=null) {
			System.out.println(brand);
		}else {
			System.out.println("brand id invalid");
		}
		*/
		
		
		 Category cat = categoryRepo.findById(2407).orElse(null);
		 
		 if(cat!=null) {
			 System.out.println(cat);
		 }else {
			 System.out.println("category id not found");
		 }
		
		
		
		
	}
	

}
