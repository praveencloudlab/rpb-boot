package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.sql.init.dependency.DependsOnDatabaseInitialization;

@Data
@NoArgsConstructor
@Entity
public class Book {

	@Id
	private int id;
	private String bookName;

	public Book(int id, String bookName) {
		this.id = id;
		this.bookName = bookName;
	}

}
