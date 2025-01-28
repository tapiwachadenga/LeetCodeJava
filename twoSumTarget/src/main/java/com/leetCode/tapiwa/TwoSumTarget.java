package com.leetCode.tapiwa;

import java.security.SecureRandom;

public class TwoSumTarget
{
	public static int[] twoSumTarget(int[] arr, int target)
	{
		int[] result = new int[2];
		
		for(int i = 0; i < arr.length - 1; i++)
			for(int j = i + 1; j < arr.length; j++)
				if (arr[i] + arr[j] == target)
				{
					result[0] = arr[i];
					result[1] = arr[j];
				}	
		if (result[0] > result[1])
			swap(result);
		
		return result;
	}

	public static void swap(int[] arr)
	{
		arr[0] ^= arr[1];
		arr[1] ^= arr[0];
		arr[0] ^= arr[1];
	}

	public static int[] add(int[] arr, int val)
	{
		// int newSize = arr.length + 1;
		int[] newArr = new int [arr.length + 1];
		for (int i = 0; i < arr.length; i++)
			newArr[i] = arr[i];
		newArr[arr.length] = val;

		return newArr;
	}

	public static boolean find(int[] arr, int val)
	{
		for (int i = 0; i < arr.length; i++)
			if (arr[i] == val)
				return true;
		return false;
	}

	public static int[] newArray(int size)
	{
		int[] arr = new int[size];
		SecureRandom sr = new SecureRandom();

		for(int i = 0; i < size; i++)
			arr[i] = sr.nextInt(26);
		return arr;
	}
}
