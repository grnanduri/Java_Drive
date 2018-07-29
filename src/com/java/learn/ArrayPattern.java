package com.java.learn;

public class ArrayPattern {

	public static int[] seriesUp(int n) {
	    int[] arr = new int[n*(n+1)/2];
	    
	    int index = 0;  
	    for(int i = 1; i <= n; i++) {
	        for(int j = 0; j < i; j++) {
	            arr[index + j] = j + 1;
	        }
	        index += i;
	    }                           
	    return arr;
	}
	
	// Driver program
    public static void main(String[] args)
    {
        int x = 5;
        seriesUp(x);
    }
}
