package com.stark.string.programs;

import java.util.Scanner;

public class PolindromeString {
	
	public static void main(String args[]){
		
		String inputString;
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter a string/number: ");
		inputString = sc.nextLine();
		isPolindrome(inputString);
	}
	
	public static void isPolindrome(String originalString){
		
		String reverseString="";
		int length = originalString.length();
		
		for(int i = length-1; i>=0; i--){
			reverseString =reverseString+originalString.charAt(i);
		}
		
		if(reverseString.equals(originalString)){
			System.out.println("Entered string/number is a polindrome");
		}else{
			System.out.println("Entered string/number is not a polindrome");
		}
	}
}
