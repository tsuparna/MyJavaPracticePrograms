package com.stark.string.programs;

import java.util.Scanner;

public class HowManyWordsInGivenSentence {
	
	/*
	 * A Sentence is made up of a group of words. each word is a 
	 * sequence of letters('a'-'z', 'A'-'Z'). that may contain one or more 
	 * hyphens and may end in a punctuation mark:period(.), comma(,), 
	 * question mark(?), or exclamation point(!), words will be separated
	 * by one or more white space characters, Hyphens join two words 
	 * into one and should be retained while the other punctuation marks 
	 * should be stripped. Determine the number of words in a given sentence.
	 * 
	 * Example:
	 * s='How many eggs are in a half-dozen, 13?'
	 * The list of words in the string is ['How', 'many', 'eggs', 'are',
	 *  'in', 'a', 'half-dozen'] and the number of words is 7. 
	 *  Notice that the numeric string '13', is not a word 
	 *  because it is not within the allowed character set.
	 * */

	
	public static void main(String args[]){
		String inputString = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input string: ");
		inputString = sc.nextLine();
		System.out.println("Number of words in a given sentence: "+howManyWordsInSentence(inputString) );
	}
	
	static int howManyWordsInSentence(String sentence){
		int count =0;	
		String[] strArray = sentence.split(" ");
		for(String str: strArray){
			str = str.trim();
			str = str.replaceAll("[:!?,.'@*&$#\\s\\d]", "");
			if(str.length() >0){
				//str = str.substring(0, str.length()-1);
				
				str = str.replaceAll("-", "");
				
				if(str.matches("^[a-zA-Z]*$")){
					System.out.println(str);
					count = count +1;
				}
			}
		}
		return count;
	}
	
}
