package com.stark.string.programs;

import java.util.Scanner;

public class PrintUniqueCharacterString {
	
public static void main(String args []){
		
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter input string: ");
		String inputString = sc.nextLine();
		printUniqueCharacterString(inputString);
	}
	
	public static void printUniqueCharacterString(String inputString){
		
		String uniqueString = "";
		int length = inputString.length();
		
		for(int i=0; i<length; i++){
			char ch = inputString.charAt(i);
			if(uniqueString.indexOf(ch)==-1){
				uniqueString = uniqueString+ch;
			}else{
				uniqueString.replace(String.valueOf(ch), "");
			}
			
		}
		
		System.out.println("Unique String: "+ uniqueString);
	}

}
