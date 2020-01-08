package com.capgemini.springcode;

import java.applet.AppletContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.capgemini.springcore.beans.Animal;
import com.capgemini.springcore.beans.Pet;
import com.capgimini.springcore.config.ComponentScanConfig;

public class AnnotationComponentScanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new AnnotationConfigApplicationContext(ComponentScanConfig.class);
		
	Animal animal = context.getBean(Animal.class)	;
	animal.makeSound();
	
	Pet pet = context.getBean(Pet.class);
	pet.getAnimal().makeSound();
		
		
		
	}

}
