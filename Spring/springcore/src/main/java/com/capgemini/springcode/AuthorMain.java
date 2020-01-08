package com.capgemini.springcode;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.capgemini.springcore.beans.Book;
import com.capgimini.springcore.config.BookConfig;

public class AuthorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(BookConfig.class);
		Book book = context.getBean(Book.class);
		System.out.println(book.getName());
		System.out.println(book.getAuthor());
	}

}
