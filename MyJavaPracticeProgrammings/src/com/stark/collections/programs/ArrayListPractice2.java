package com.stark.collections.programs;

import java.util.ArrayList;

public class ArrayListPractice2 {

	
	public static void main(String args[]){
		
		ArrayList<Integer> marksList = new ArrayList<Integer>();
		marksList.add(100);
		marksList.add(98);
		
		
		ArrayList<Double> marksDecimalList = new ArrayList<Double>();
		marksDecimalList.add(99.50);
		marksDecimalList.add(95.75);
		marksDecimalList.add(100.0);
		
		ArrayList<String> stuNames = new ArrayList<String>();
		stuNames.add("KK");
		stuNames.add("stark");
		stuNames.add("kranti");
		stuNames.add("suparna");
		
		System.out.println("marksList: "+marksList);
		System.out.println("marksDecimalList: "+marksDecimalList);
		System.out.println("stuNames: "+stuNames);
	}
}
