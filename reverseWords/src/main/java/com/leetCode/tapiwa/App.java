package com.leetCode.tapiwa;

/**
 * Hello world!
 *
 */

import java.util.Scanner;
import java.util.Arrays;

public class App 
{
    public static void main( String[] args )
    {    
        System.out.printf( "\nEnter sentence: " );
	String sentence = new Scanner(System.in).nextLine();
        System.out.printf( "reverseWords(%s) = %s\n", sentence, ReverseWords.reverseWords(sentence) );
    }
}
