package com.cap.exception.Throwkey;
//exception propagation example
public class GoogleMap {
void findlocation(String loc)
{
	try {
		System.out.println(loc.length());
	}catch(NullPointerException n)
	{
		System.out.println("plrase fill location name");
		throw n;
	}
}
}
