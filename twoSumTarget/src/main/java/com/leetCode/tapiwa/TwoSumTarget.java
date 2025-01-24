package com.leetCode.tapiwa;

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
}
