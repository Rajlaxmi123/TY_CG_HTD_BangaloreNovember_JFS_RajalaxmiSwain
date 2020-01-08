package com.capgimini.springcore.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.capgemini.springcore.beans.Author;
import com.capgemini.springcore.beans.Book;

public class BookConfig {

	@Bean("author")
	@Scope("prototype")
public Author getauthor()	
{ Author  author = new Author();
author.setName("Chanakya");

	return author;
}
	@Bean("book")	
	public Book book()
	{
		Book book =  new Book();
		book.setName("ChandraGuptaMorya");
		book.setAuthor(getauthor());
		return book;
	}
		

	

}
