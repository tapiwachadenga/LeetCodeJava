package com.leetCode.tapiwa;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // System.out.println( "Hello World!" );
	int[] arr = {7, 5, 6, 3, 8, 9, 10};
	int target = 10;
	// System.out.printf("\nBefore swap: %s\n", Arrays.toString(arr));
	// TwoSumTarget.swap(arr);
	// System.out.printf("After swap: %s\n", Arrays.toString(arr));
	System.out.printf("twoSumTarget(%s, %d): %s\n", Arrays.toString(arr), target, Arrays.toString(TwoSumTarget.twoSumTarget(arr, target)));
    }
}
