package com.stark.collections.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListRemoveDuplicates {
	
	public static void main(String args[]){
		
		ArrayList<Integer> numbersList = new ArrayList<Integer>(Arrays.
				asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20));
		
		//1. LinkedHashSet
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>(numbersList);
		ArrayList<Integer> numListWithoutDuplicates = new ArrayList<Integer>(linkedHashSet);
		System.out.println(numListWithoutDuplicates);
		
		//2. JDK 8 -stream
		List<Integer> uniqueList = numbersList.stream().distinct().collect(Collectors.toList());
		System.out.println(uniqueList);
	}

}
