package com.java.learn;

import java.util.HashSet;
import java.util.Iterator;


public class RemoveDuplicatesinDiffWays {

 /**
 * brute force- o(N square)
 * 
 * @param input
 * @return
 */
public static int[] removeDups(int[] input){
    boolean[] isSame = new boolean[input.length];
    int sameNums = 0;

    for( int i = 0; i < input.length; i++ ){
        for( int j = i+1; j < input.length; j++){
            if( input[j] == input[i] ){ //compare same
                isSame[j] = true;
                sameNums++;
            }
        }
    }

    //compact the array into the result.
    int[] result = new int[input.length-sameNums];
    int count = 0;
    for( int i = 0; i < input.length; i++ ){
        if( isSame[i] == true) {
            continue;
        }
        else{
            result[count] = input[i];
            count++;
        }
    }

    return result;
}

/**
 * set - o(N)
 * does not guarantee order of elements returned - set property
 * 
 * @param input
 * @return
 */
public static int[] removeDups1(int[] input){
    HashSet myset = new HashSet();

    for( int i = 0; i < input.length; i++ ){
        myset.add(input[i]);
    }

    //compact the array into the result.
    int[] result = new int[myset.size()];
    Iterator setitr = myset.iterator();
    int count = 0;
    while( setitr.hasNext() ){
        result[count] = (int) setitr.next();
        count++;
    }

return result;
}

/**
 * quicksort - o(Nlogn)
 * 
 * @param input
 * @return
 */
public static int[] removeDups2(int[] input){
	QuickSort st = new QuickSort();
    st.sort(input, 0, input.length-1); //input is sorted

    //compact the array into the result.
    int[] intermediateResult = new int[input.length];
    int count = 0;
    int prev = Integer.MIN_VALUE;
    for( int i = 0; i < input.length; i++ ){
        if( input[i] != prev ){
            intermediateResult[count] = input[i];
            count++;
        }
        prev = input[i];
    }

    int[] result = new int[count];
    System.arraycopy(intermediateResult, 0, result, 0, count);

    return result;
}


public static void printArray(int[] input){
    for( int i = 0; i < input.length; i++ ){
        System.out.print(input[i] + " ");
    }
}

public static void main(String[] args){
    int[] input = {5,6,8,0,1,2,5,9,11,0};
    RemoveDuplicatesinDiffWays.printArray(RemoveDuplicatesinDiffWays.removeDups(input));
    System.out.println();
    RemoveDuplicatesinDiffWays.printArray(RemoveDuplicatesinDiffWays.removeDups1(input));
    System.out.println();
    RemoveDuplicatesinDiffWays.printArray(RemoveDuplicatesinDiffWays.removeDups2(input));
}
}