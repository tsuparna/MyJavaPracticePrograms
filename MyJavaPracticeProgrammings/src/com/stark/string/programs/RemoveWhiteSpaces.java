package com.stark.string.programs;

import java.util.Scanner;

public class RemoveWhiteSpaces {
	
	public static void main(String args[]){
		String inputString = "Suparna Tatrashi is an Auto  m ation Eng  i ne      er";
		/*Scanner sc= new Scanner(System.in);
		System.out.println("Enter input string: ");
		String inputString =sc.nextLine();*/
		
		removeWhiteSpacesUsingReplaceMethod(inputString);
		removeWhiteSpacesWithoutUsingReplaceMethod(inputString);
	}

	public static void removeWhiteSpacesUsingReplaceMethod(String inputString){
		inputString = inputString.replaceAll("\\s", "");
		System.out.println(inputString);
	}
	
	public static void removeWhiteSpacesWithoutUsingReplaceMethod(String inputString){
		char[] chars = inputString.toCharArray();
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<chars.length; i++){
			if((chars[i] !=' ') && (chars[i] !='\t')){
				sb.append(chars[i]);
			}
		}
		System.out.println(sb);
	}
}
