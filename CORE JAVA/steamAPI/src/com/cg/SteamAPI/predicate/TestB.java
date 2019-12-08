package com.cg.SteamAPI.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TestB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a1= new ArrayList<Integer>();

		a1.add(67);
		a1.add(45);
		a1.add(89);
		a1.add(24);
		a1.add(76);


		List<Integer> l1 = a1.stream().filter(i -> i% 2 != 0 ).collect(Collectors.toList());
		System.out.println(l1);


List l2 = a1.stream().map(i -> i* 100).collect(Collectors.toList());
System.out.println(l2);




Optional<Integer> a = a1.stream().max((i,j)-> i.compareTo(j));//getting maximum value in console
System.out.println(a);
System.out.println(a1.stream().count());



	}

}
