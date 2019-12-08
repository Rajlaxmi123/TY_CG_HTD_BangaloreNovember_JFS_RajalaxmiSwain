package com.capgemini.junit.junit_five;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCalculator {
	
	Calculator c = null;
	@BeforeEach
	void createObject()
	{
		c =  new Calculator();
	}

	@Test
	void test() {
		Calculator c = new Calculator();
		int i = c.add(10, 5);
		
		assertEquals(15,i);
		
	}
	@Test
	void testAddForNegative() {
		Calculator c = new Calculator();
		int i = c.add(-10, 5);
		
		assertEquals(-5,i);
	}

	
	@Test
	void testmultiply()
	{
		Calculator c = new Calculator();
		int j= c.multi(4, 20);
		assertEquals(80,j);
		
	}
	
	
	
	@Test
	void testdivision()
	{
		Calculator c = new Calculator();
	
		assertThrows(ArithmeticException.class,
				()-> {
					c.div(10, 0);
				}
				);
		
	}
	
	@Test
	void testFindLength1()
	{
		Calculator c = new Calculator();
		int res = c.findLength("rajjjjj");
		assertEquals(5,res);
		
	}
	
	@Test
	void testFindLength()
	{
		Calculator c = new Calculator();
	
		assertThrows(NullPointerException.class,
				()-> {
			c.findLength(null);
		}
		);
		
	}
	
	
	
}
