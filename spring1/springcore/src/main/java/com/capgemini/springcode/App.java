package com.capgemini.springcode;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore.beans.Animal;
import com.capgemini.springcore.beans.Hello;
import com.capgemini.springcore.beans.Pet;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Hello hello = context.getBean(Hello.class);
        Hello hello1 = context.getBean(Hello.class);
        Hello hello2 = context.getBean(Hello.class);
       
        
        System.out.println(hello1==hello2);//returns true coz by default it will create only one singleton object
        //if we add scope inside bean.xml in bean tag ,it will create different objects and gives faLSE.
        
        System.out.println(hello1);
        System.out.println(hello2);
       // hello.setCount(Integer.parseInt("10"));
        System.out.println(hello.getMsg());
        System.out.println(hello.getCount());
        
        System.out.println("************************");
        
        Animal animal = context.getBean(Animal.class);//since cat object is a type of animal,we can write here Animal.class
        //getBeans method is a factory method.
        animal.makeSound();
        
        
        System.out.println("**************");
        Pet pet = context.getBean(Pet.class);
        System.out.println(pet.getName());
        pet.getAnimal().makeSound();
        
    }
}
 