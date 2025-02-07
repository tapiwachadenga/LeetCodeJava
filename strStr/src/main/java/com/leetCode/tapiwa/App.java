package com.leetCode.tapiwa;

/**
 * Hello world!
 *
 */

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
	System.out.printf("\nEnter hatStack: ");    
        String hst = new Scanner(System.in).nextLine();
	// String ndl = "mom";
	System.out.printf("Enter needle: ");    
        String ndl = new Scanner(System.in).nextLine();

	System.out.printf("\nstrsrt(%s, %s) = %d\n", hst, ndl, StrStr.strstr(hst, ndl));	
    }
}
