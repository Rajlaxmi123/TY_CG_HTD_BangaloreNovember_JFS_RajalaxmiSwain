package com.cap.sorting;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class ArrayBubbleSort {

	//BubbleSort
	public static void bubbleSort(int arr[])
	    {
		 
		 
	        int size = arr.length;
	        for (int i = 0; i < size-1; i++)
	            for (int j = 0; j < size-i-1; j++)
	                if (arr[j] > arr[j+1])
	                {
	                    // swap temp and arr[i]
	                    int temp = arr[j];
	                    arr[j] = arr[j+1];
	                    arr[j+1] = temp;
	                }
	
	
	    }
	 
	 static void printArray(int arr[])
	    {
	        int n = arr.length;
	        for (int i=0; i<n; ++i)
	            System.out.print(" " +arr[i]);
	        
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ArrayBubbleSort a= new ArrayBubbleSort();
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter the size of an array");
//		
//		int n = sc.nextInt();
//		
//		
//		System.out.println("Enter the elements");
//		int[]  arr = new int[n];
//		
//	
//		for(int i=0;i<n;i++)
//		{
//			arr[i] = sc.nextInt();
//		
//		}	
		
	countingDuration1();
		
	
	}
	
	public static void countingDuration1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of an array");
		
		int n = sc.nextInt();
		
		
		System.out.println("Enter the elements");
		int[]  arr = new int[n];
		
	
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		
		}	
		
		Instant start = Instant.now();
		bubbleSort(arr);
		System.out.println(" the sorted array is :");
		printArray(arr);
		Instant end = Instant.now();
		Long duration = Duration.between(start, end).toMillis();
		//will calculate the time that how much time the method took
		
		double seconds = duration /1000.0;
		System.out.println("\n bubblesort time:" +seconds + " seconds");
		
		
		
	}

}
