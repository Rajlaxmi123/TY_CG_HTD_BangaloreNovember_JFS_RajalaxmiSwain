package com.capgimini.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import com.capgemini.springcore.beans.Cat;
import com.capgemini.springcore.beans.Dog;
import com.capgemini.springcore.beans.Hello;
import com.capgemini.springcore.beans.Pet;

@Configuration
public class BeansConfig {
	
@Bean("hello")	  //name of the bean passed //represent everything written inside <bean></bean>
@Scope("prototype")
public Hello getHello()                   // it is a factorymethod(method returning an object)
{
	Hello hello = new Hello();
	hello.setMsg("I love rajlaxmi");
	hello.setCount(1000);
	return hello;
}

@Bean(name="dog")
public Dog getDog()
{
	return new Dog();
}

@Bean("pet")
 public Pet getPet()
 {
	 Pet pet = new Pet();
	 pet.setName("Tuffy");
	// pet.setAnimal(getDog());
	 return pet;
	 
 }

@Bean("cat")
@Primary            //else it will give exception coz object two class dog and cat are being used,so
//confusion occurs
public Cat getCat()
{
	return new Cat();
}






}
