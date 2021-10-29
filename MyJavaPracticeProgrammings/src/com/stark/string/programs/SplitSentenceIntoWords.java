package com.stark.string.programs;

import java.util.StringTokenizer;

public class SplitSentenceIntoWords {
	
	public static void main(String args[]){
		String inputString = "Suparna Tatrashi is an Automation Engineer";
		/*Scanner sc= new Scanner(System.in);
		System.out.println("Enter input string: ");
		String inputString =sc.nextLine();*/
		
		splitSentenceIntoWordsUsingSplitMethod(inputString);
		SplitSentenceIntoWordsWithStringTokenizer(inputString);
		SplitSentenceIntoWordsWithOutUsingSplitMethod(inputString);
	}


	public static void splitSentenceIntoWordsUsingSplitMethod(String inputString){
		String[] words = inputString.split(" ");
		
		for(String word: words){
			System.out.println(word);
		}
		
		
	}
	
	public static void SplitSentenceIntoWordsWithStringTokenizer(String inputString){
		
		String delimeter = " ";
		StringTokenizer st= new StringTokenizer(inputString, delimeter);
		System.out.println(st.countTokens());
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
	}
	
	public static void SplitSentenceIntoWordsWithOutUsingSplitMethod(String inputString){
		char whiteSpace = ' ';
		for(int i=0; i<inputString.length(); i++){
			if(inputString.charAt(i)==whiteSpace){
				System.out.println();
				continue;
			}
			System.out.print(inputString.charAt(i));
		}
	}
	
}
