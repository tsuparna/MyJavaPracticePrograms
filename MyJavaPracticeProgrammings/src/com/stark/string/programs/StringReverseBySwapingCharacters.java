package com.stark.string.programs;

import java.util.Scanner;

public class StringReverseBySwapingCharacters {
	
	public static void main(String args []){
		
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter input string: ");
		String inputString = sc.nextLine();
		printReverseStringBySwapingCharacters(inputString);
	}
	
	public static void printReverseStringBySwapingCharacters(String inputString){
		
		StringBuffer enteredString = new StringBuffer();
		enteredString = enteredString.append(inputString);
		int length = enteredString.length();
		int iterations = length/2;
		int temp = length-1;
		
		for(int i=0; i<iterations; i++){
			
			char ch1 = enteredString.charAt(i);
			char ch2 = enteredString.charAt(temp);
			
			enteredString.setCharAt(i, ch2);
			enteredString.setCharAt(temp, ch1);
			
			temp--;
		}
		System.out.println("Reverse String: "+ enteredString.toString());
	}

}
