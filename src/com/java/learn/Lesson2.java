package com.java.learn;

public class Lesson2 {

	 public static void main(String args[])
	    {
	        int arr[] = {10, 7, 8, 9, 1, 5};
	        int n = arr.length;
	 
	        QuickSort ob = new QuickSort();
	        ob.sort(arr, 0, n-1);
	 
	        System.out.println("sorted array");
	        QuickSort.printArray(arr);
	    }
}
