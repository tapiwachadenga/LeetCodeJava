package com.leetCode.tapiwa;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
	Scanner sc = new Scanner(System.in);
	System.out.print("\nEnter string: ");
        String str = sc.nextLine();;
	System.out.printf("\nisValidPalindrome(%s) = %s\n", str, IsValidPalindrome.isValidPalindrome(str));
    }
}
