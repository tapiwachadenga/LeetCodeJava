package com.leetCode.tapiwa;


public class StrStr
{
	public static int needleAt(String hayStack, String needle)
	{

		if( (hayStack == null || hayStack.trim().isEmpty() ) && ( needle != null && !needle.trim().isEmpty()) )
			return -1;
		if( (needle == null || needle.trim().isEmpty())  || ( hayStack == null || hayStack.trim().isEmpty()))
			return 0;

		int hayIndex;
		// int needleIndex = 0;
		int lastCheck = hayStack.length() - needle.length();
		
		for(hayIndex = 0;  hayIndex <= lastCheck; hayIndex++)
		{
			if(hayStack.charAt(hayIndex) == needle.charAt(0))
			{
				if(hayStack.substring(hayIndex, hayIndex + needle.length()).equals(needle))
					return hayIndex;
				else
					continue;
			}
		}	
		return -1;
	}

	public static int strstr(String haystack, String needle)
	{
		for(int i = 0; ; i++)
			for(int j = 0; ; j++)
			{
				if(j == needle.length()) return i;
				if(i + j == haystack.length()) return -1;
			       	if(haystack.charAt(i + j) != needle.charAt(j)) break; 	
			}
	}
}
