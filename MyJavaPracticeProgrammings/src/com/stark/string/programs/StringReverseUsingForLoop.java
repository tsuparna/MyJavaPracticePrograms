package com.stark.string.programs;

import java.util.Scanner;

public class StringReverseUsingForLoop {
	
	public static void main(String args []){
		
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter input string: ");
		String inputString = sc.nextLine();
		printReverseStringUsingForLoop(inputString);
	}
	
	public static void printReverseStringUsingForLoop(String inputString){
		
		String reverseString="";
		int length = inputString.length();
		
		for(int i=length-1; i>=0; i--){
			reverseString = reverseString + inputString.charAt(i);
		}
		
		System.out.println("Reverse String: "+ reverseString);
	}

}
