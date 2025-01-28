package com.leetCode.tapiwa;

import java.util.Arrays;
import java.security.SecureRandom;
import java.util.Collections;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // System.out.println( "Hello World!" );
	SecureRandom randIntGenerator = new SecureRandom();
	int size = randIntGenerator.nextInt(16);
	int[] arr = TwoSumTarget.newArray(size);
	int[] newArr = TwoSumTarget.add(arr, randIntGenerator.nextInt(20));

	Integer[] newIntegerArr = new Integer[newArr.length];
	// Arrays.setAll(newArr, i -> newIntegerArr[i]);

	for(int i = 0; i < newArr.length; i++)
		newIntegerArr[i] = newArr[i];

	int randInt = randIntGenerator.nextInt(Collections.max(Arrays.asList(newIntegerArr)));
	System.out.printf("\nisInArray(%d): \n%b\n", randInt, TwoSumTarget.find(newArr, randInt));
	int target = randIntGenerator.nextInt(Collections.max(Arrays.asList(newIntegerArr)));
	// System.out.printf("\nBefore swap: %s\n", Arrays.toString(arr));
	// TwoSumTarget.swap(arr);
	// System.out.printf("After swap: %s\n", Arrays.toString(arr));
	System.out.printf("\ntwoSumTarget(%s, %d): %s\n", Arrays.toString(newArr), target, Arrays.toString(TwoSumTarget.twoSumTarget(newArr, target)));
    }
}
