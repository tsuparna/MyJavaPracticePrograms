package com.stark.string.programs;

import java.util.Scanner;

public class DuplicateCharacters {
	
	public static void main(String args[]){
		
		String inputString ="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input string: ");
		inputString = sc.nextLine();
		
		System.out.println("Duplicate characters in entered string: ");
		
		
		char[] chars = inputString.toCharArray();
		for(int i=0; i<inputString.length(); i++){
			int count=1;
			for(int j=i+1; j<inputString.length(); j++){
				if(chars[i] == chars[j]){
					//System.out.println(chars[j]);
					//inputString.replace(chars[j], "");
					count++;
				}
				
			}
			if(count >=2){
				System.out.println(chars[i]);
			}
		}
	}

}
