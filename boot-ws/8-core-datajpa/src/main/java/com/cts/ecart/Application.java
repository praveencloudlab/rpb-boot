package com.cts.ecart;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

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
		
		/*
		
		 Category cat = categoryRepo.findById(2407).orElse(null);
		 
		 if(cat!=null) {
			 System.out.println(cat);
		 }else {
			 System.out.println("category id not found");
		 }
		 */
		
		
		//categoryRepo.findByCategoryName("Electronics").forEach(System.out::println);
		
		//categoryRepo.findByCategoryNameLike("%Ele%").forEach(System.out::println);
		
		List<Category> cats = categoryRepo.findByCategoryNameLike("%Ele%");
		
		// List<Brand> brands = cats.stream().findFirst().get().getBrands().stream().filter(brand->brand.getBrandName().equals("Apple")).toList();
	    Brand brandObj = cats.stream().findFirst().get().getBrands().stream().findAny().filter(brand->brand.getBrandName().equals("Apple")).orElse(null);

		
		System.out.println("====================");
		
		if(brandObj!=null)
		System.out.println(brandObj);
		else
		System.out.println("Invalid Brand. Brand name not found");

		// brands.forEach(System.out::println);
		
		
		
		//list.forEach(System.out::println);
		
		
		
	}
	

}
