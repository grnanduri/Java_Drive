package com.java.learn;

public class RemoveDuplicatesInArray {

	public static int[] removeDuplicates(int[] arr){
	    int end = arr.length;

	    for (int i = 0; i < end; i++) {
	        for (int j = i + 1; j < end; j++) {
	            if (arr[i] == arr[j]) {                  
	                /*int shiftLeft = j;
	                for (int k = j+1; k < end; k++, shiftLeft++) {
	                    arr[shiftLeft] = arr[k];
	                }*/
	                arr[j] = arr[end-1];
	                end--;
	                j--;
	            }
	        }
	    }

	    int[] whitelist = new int[end];
	    for(int i = 0; i < end; i++){
	        whitelist[i] = arr[i];
	        System.out.println(whitelist[i]+ "");
	    }
	    
	    return whitelist;
	}
	
	public static void main(String args[]) {
		
		int[] arr = {33,42,55,2,76,33,89,56,78,45,36,47,2};
		removeDuplicates(arr);
	}
}
