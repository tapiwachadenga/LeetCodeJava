package com.leetCode.tapiwa;

import org.apache.commons.lang3.StringUtils;

public class IsValidPalindrome
{
	public static boolean isValidPalindrome(String str)
	{
		int start = 0;
		int end = str.length() - 1;
		
		while (start < end)
		{
			while(!isAlphaNumeric(str.charAt(start)))
				start++;
			while(!isAlphaNumeric(str.charAt(end)))
				end--;

			if(Character.compare( Character.toLowerCase(str.charAt(start)), Character.toLowerCase(str.charAt(end))) != 0)
			{
				System.out.printf("str[%d] = %c\tstr[%d] = %c\n", start, str.charAt(start), end, str.charAt(end));
				return false;
			}

			start++;
			end--;
		}
		return true;
	}

	public static boolean isAlphaNumeric(char character)
	{
		if ((character >= '0' & character <= '9') || (character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z'))
			return true;
		return false;
	}
}
