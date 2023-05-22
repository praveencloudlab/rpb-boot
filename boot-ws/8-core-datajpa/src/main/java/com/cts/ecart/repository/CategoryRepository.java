package com.cts.ecart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cts.ecart.entity.Category;
import java.util.List;

//@Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED)
public interface CategoryRepository extends JpaRepository<Category, Integer> {
	
	// DSL : Domain specify language 
	
	List<Category> findByCategoryName(String categoryName);
	
	List<Category> findByCategoryNameLike(String name);
	
	// Query
	
	//@Query(name = "q1",value = "from com.cts.ecart.entity.Category")
	//List<Category> getCatsByName();
	
	
	
}
