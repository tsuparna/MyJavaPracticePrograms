package com.stark.collections.programs;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterations {
	
	public static void main(String args[]){
		
		ArrayList<String> empNamesList = new ArrayList<String>();
		empNamesList.add("KK");
		empNamesList.add("stark");
		empNamesList.add("kranti");
		empNamesList.add("suparna");
		
		
		//for loop
		System.out.println("for loop");
		for(int i=0; i<empNamesList.size();i++){
			System.out.println(empNamesList.get(i));
		}
		System.out.println("-----------------------");
		
		
		//for each loop:
		System.out.println("for each loop");
		for(String empName: empNamesList){
			System.out.println(empName);
		}
		System.out.println("-----------------------");
		
		
		//Iterator:
		System.out.println("Iterator");
		Iterator<String> empName = empNamesList.iterator();
		while(empName.hasNext()){
			System.out.println(empName.next());
		}
		System.out.println("-----------------------");
		
		
		//JDK 8 -streams with lamda:
		System.out.println("JDK 8 -streams with lamda:");
		empNamesList.stream().forEach(empName1 -> System.out.println(empName1));
	}

}
