package com.leetCode.tapiwa;

import java.util.Arrays;

public class ReverseWords
{
	public static String reverseWords(String sentence)
	{
		String[] sentenceArray = sentence.split(" ");
		String[] reversedStringArray = reverseStringArray(sentenceArray);
		return String.join(" ", reversedStringArray);
	}

	public static String[] reverseStringArray(String[] arr)
	{
		String[] reversedArray = new String[arr.length];

		for( int i = arr.length - 1, j = 0; i >= 0 && j < arr.length; i--, j++)
		{
			reversedArray[j] = arr[i];
		}
		return reversedArray;
	}
}
