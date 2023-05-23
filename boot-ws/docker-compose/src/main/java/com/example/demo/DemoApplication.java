package com.example.demo;

import com.example.demo.entity.Book;
import com.example.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/books")
public class DemoApplication {
	
	
	
    @Autowired
    private BookRepository bookRepository;
    

    
   // Book b=new Book(10, "Java");
    
    
    
    
    
    @PostMapping
    public Book save(@RequestBody Book book){
       return bookRepository.save(book);
    }

    @GetMapping
    public List<Book> listAll(){
        return bookRepository.findAll();
    }


    public static void main(String[] args) {
        ConfigurableApplicationContext ac = SpringApplication.run(DemoApplication.class, args);
    	BookRepository bookRepo = ac.getBean(BookRepository.class);
    	
    	List<Book> books = Arrays.asList(new Book(1, "Java"),new Book(11, "Spring"),new Book(111, "Spring Boot"));
	
    	bookRepo.saveAll(books);
    	
    	bookRepo.findAll().forEach(System.out::println);
        
    }
    
    

}
