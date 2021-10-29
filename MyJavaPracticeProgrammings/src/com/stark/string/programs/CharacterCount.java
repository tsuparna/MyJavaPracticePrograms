package com.stark.string.programs;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class CharacterCount {
	
	public static void main(String args[]){
		String inputString = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input string: ");
		inputString = sc.nextLine();
		
		int count= inputString.length();
		System.out.println(count);
		countOccurrencesOfACharacterInString(inputString);
		countOccurencesOfEachCharacterInString(inputString);
	}
	
	public static void countOccurrencesOfACharacterInString(String inputString){
		
		char characterToCount = 's';
		int count=0;
		for(int i=0; i<inputString.length(); i++){
			if(inputString.charAt(i)==characterToCount){
				count++;
			}
		}
		System.out.println(characterToCount +" appeared: "+ count + " times");
	}

	public static void countOccurencesOfEachCharacterInString(String inputString){
		System.out.println(" countOccurencesOfEachCharacterInString");
		char[] stringCharacters = inputString.toCharArray();
		int length = inputString.length();
		Set<Character> charSet = new HashSet<>();
		for (char character : stringCharacters) {
			charSet.add(character);
		}
		
		System.out.println(charSet);
		
		Iterator<Character> it = charSet.iterator();
		while(it.hasNext()){
			char ch = it.next();
			//System.out.println("Character: "+ ch);
			
			int count=1;
			for(int i=0; i<length; i++){
				if(inputString.charAt(i)==ch){
					count++;
				}
			}
			System.out.println("Character: "+ ch+ " appeared: "+ count + " times");
		}
		
	}
}
