package com.stark.collections.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {
	
	public static void main(String args[]){
		
		ArrayList<String> array1 = new ArrayList<String>();
		array1.add("java");
		array1.add("Python");
		array1.add("C");
		array1.add("javaScript");
		
		ArrayList<String> array2 = new ArrayList<String>();
		array2.add("Testing");
		array2.add("Devops");
		
		array1.addAll(array2);
		System.out.println(array1);
		
		
		array1.addAll(2, array2);
		System.out.println(array1);
		
		System.out.println(array2);
		array2.clear();
		System.out.println(array2);
		
		
		
		ArrayList<String> cloneList = (ArrayList<String>)array1.clone();
		System.out.println(cloneList);
		
		
		System.out.println(array1.contains("Python"));
		System.out.println(array1.contains("Ruby"));
		System.out.println(array1.indexOf("C")>0);
		
		
		
		
		ArrayList<String> empNamesList = new ArrayList<String>();
		empNamesList.add("stark");
		empNamesList.add("KK");
		empNamesList.add("stark");
		empNamesList.add("KK");
		empNamesList.add("suparna");
		empNamesList.add("stark");
		empNamesList.add("kranti");
		empNamesList.add("stark");
		empNamesList.add("KK");
		empNamesList.add("suparna");
		empNamesList.add("stark");
		
		int i= empNamesList.indexOf("stark");
		System.out.println("stark index:"+i);
		
		empNamesList.remove(1);
		System.out.println(empNamesList);
		
		empNamesList.remove("suparna");
		System.out.println(empNamesList);
		
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.
				asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20));
		numbers.removeIf(num -> num%2 == 0);
		System.out.println("Odd numbers: "+numbers);
		
		ArrayList<String> namesList = (ArrayList<String>)empNamesList.clone();
		
		System.out.println("namesList: "+ namesList);
		
		namesList.retainAll(Collections.singleton("stark"));
		System.out.println(namesList);
		
		
		ArrayList<Integer> numbersList = (ArrayList<Integer>)numbers.clone();
		System.out.println("numbersList: "+ numbersList);
		
		ArrayList<Integer> subList = new ArrayList<Integer>(numbersList.subList(2, 5));
		System.out.println("subList: "+ subList);
		
		
		ArrayList<String> empList = new ArrayList<String>();
		empList.add("KK");
		empList.add("stark");
		empList.add("kranti");
		empList.add("suparna");
		
		Object arr[] = empList.toArray();
		System.out.println(Arrays.toString(arr));
		
		
		
		for(Object obj: arr){
			System.out.println((String)obj);
		}
		
	}

}
