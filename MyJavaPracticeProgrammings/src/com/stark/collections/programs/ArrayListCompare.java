package com.stark.collections.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListCompare {

	public static void main(String args[]){

		//1. sort and compare equals
		ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "F"));
		ArrayList<String> list2 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E"));
		ArrayList<String> list3 = new ArrayList<String>(Arrays.asList( "D", "A", "C", "B", "F"));

		System.out.println(list1.equals(list2));
		System.out.println(list1.equals(list3));
		
		Collections.sort(list1);
		Collections.sort(list2);
		Collections.sort(list3);

		System.out.println(list1.equals(list2));
		System.out.println(list1.equals(list3));
		
		//2. compare 2 list - find out the additional elements
		ArrayList<String> list4 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "F"));
		ArrayList<String> list5 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E"));
		list4.removeAll(list5);
		System.out.println(list4);
		
		//3. find out the missing elements
		ArrayList<String> list6 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "F"));
		ArrayList<String> list7 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E"));
		list7.removeAll(list6);
		System.out.println(list7);
		
		//4. find out the common elements
		ArrayList<String> language1 = new ArrayList<String>(Arrays.asList("java", "python", "c#", "javascript", "ruby"));
		ArrayList<String> language2 = new ArrayList<String>(Arrays.asList("python", "java",  "c#", "javascript", "php"));
		
		language1.retainAll(language2);
		System.out.println(language1);
	}	

}
