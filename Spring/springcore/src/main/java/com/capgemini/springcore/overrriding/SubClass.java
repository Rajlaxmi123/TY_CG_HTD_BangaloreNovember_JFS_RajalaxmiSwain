package com.capgemini.springcore.overrriding;

import java.io.IOException;
import java.util.Stack;
import java.util.Vector;

public class SubClass extends SuperClass{

	@Override
	protected Stack<Object> method(Vector<Object> v) throws IOException{
		return null;
	}
}
