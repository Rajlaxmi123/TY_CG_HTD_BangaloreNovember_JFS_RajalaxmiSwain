package com.cap.staticAndNonstatic;

public class TestQspiders {
	public static void main(String args[]) {
	Qspiders rajajinagar = new Qspiders();
	
	rajajinagar.swipe();
	rajajinagar.swipe();
	
	Qspiders BTM = new Qspiders();
	
	BTM.swipe();
	BTM.swipe();
	
	System.out.println(rajajinagar.branchCount);
	System.out.println(Qspiders.totalCount);
	System.out.println(BTM.branchCount);
	System.out.println(Qspiders.totalCount);
	}
	
}
