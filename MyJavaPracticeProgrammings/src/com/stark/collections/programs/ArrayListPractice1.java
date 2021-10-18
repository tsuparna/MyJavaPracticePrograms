package com.stark.collections.programs;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice1 {
	
	public static void main(String args[]){
		
		
		//default class
		//dynamic array
		
		
		
		int i[]= new int[4];
		i[0] = 100;
		//i[-1]=200 // will give array list out of bound exception
		
		System.out.println(i[0]);  //100
		System.out.println(i[3]);  //0
		
		ArrayList<Object> arr = new ArrayList<Object>();
		arr.add(100);
		arr.add(200);
		arr.add("testing");
		arr.add("qa");
		arr.add('t');
		arr.add(true);
		
		System.out.println(arr);
		
		System.out.println(arr.get(2));
		System.out.println(arr.size());
		//System.out.println(arr.get(-1)); // will give array list out of bound exception
		
		arr.add(12.09);
		arr.add(false);
		System.out.println(arr.size());
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15));
		System.out.println(numbers);
		
		ArrayList<String> languages = new ArrayList<String>(Arrays.asList("Java", "Python", "C#", "C++", "C"));
		System.out.println(languages);
	}

}
