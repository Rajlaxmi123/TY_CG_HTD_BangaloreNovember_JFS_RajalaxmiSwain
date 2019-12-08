package org.tyss.typecasting.pack1;

public class TestAnimal {
	public static void main(String args[]) {
		
	
	Animal a1=new Animal();
	a1.eat();
	Animal a2=new Dog();//upcasting
	a2.eat();
	
	Dog d1=new Dog();
	d1.eat();
	d1.walk();
	
	//first upcasting and then downcasting
	Animal a3=new Lion();
	Lion l1 = (Lion)a3;
	l1.eat();
	l1.run();
	}

}
