package com.capgemini.springcode;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore.beans.Hello;

public class LifeCycleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Hello hello = context.getBean(Hello.class);
		System.out.println(hello.getMsg());
		System.out.println(hello.getCount());
		
		
		context.close();
		
		
		
		
		
		
		
	}

}
