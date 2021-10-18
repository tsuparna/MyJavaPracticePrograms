package com.stark.string.programs;

import java.util.Scanner;
import java.util.Stack;

public class StringReverseUsingStack {


	public static void main(String args []){

		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter input string: ");
		String inputString = sc.nextLine();
		printReverseStringUsingStack(inputString);
	}


	public static void printReverseStringUsingStack(String inputString){

		Stack<Character> charStack = new Stack<Character>();
		char[] inputCharArray = inputString.toCharArray();
		
		for(char c : inputCharArray){
			charStack.push(c);
		}
		
		int length = charStack.size();
		System.out.println("length: "+length);
		
		System.out.print("Reverse String: ");
		for(int i=0; i<length; i++){
			System.out.print(charStack.pop());
		}
	}

}
