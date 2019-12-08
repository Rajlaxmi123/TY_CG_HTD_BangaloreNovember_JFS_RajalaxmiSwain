package com.cap.looseCoupling.looseCoupling;

public class Cat {
	void feedChips(Chips c)
	{
		c.open();
		c.eat();
	}

}
