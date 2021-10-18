package com.stark.collections.programs;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapCountNumberOfWords {
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input strings: ");
		String inputString = sc.nextLine();
		
		String[] splitStr = inputString.split(" ");
		
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		
	    for(int i=0; i<splitStr.length; i++){
	    	
	    	if(hashMap.containsKey(splitStr[i])){
	    		int count = hashMap.get(splitStr[i]);
	    		hashMap.put(splitStr[i], count+1);
	    	}else{
	    		hashMap.put(splitStr[i], 1);
	    	}
	    }
	    System.out.println(hashMap);
		
	}

}
