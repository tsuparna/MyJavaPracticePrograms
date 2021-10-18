package com.stark.collections.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {
	
	public static void main(String args[]){
		
		//1: Collections.synchronizedList
		List<String> languagesList = Collections.
				synchronizedList(new ArrayList<String>());
		languagesList.add("java");
		languagesList.add("Python");
		languagesList.add("C");
		languagesList.add("javaScript");
		
		//add or remove - we don't need explicit synchronization
		
		//to fetch/traverse the values from this list -- we have to use explicit synchronization
		
		synchronized(languagesList){
			Iterator<String> it = languagesList.iterator();
			while(it.hasNext()){
				System.out.println(it.next());
			}
		}
		
		//2: CopyOnWriteArrayList -- its a class
		CopyOnWriteArrayList<String> empList = new CopyOnWriteArrayList<String>();
		empList.add("KK");
		empList.add("stark");
		empList.add("kranti");
		empList.add("suparna");
		
		//we don't need explicit synchronization for any operation: add/remove/traverse
		
		Iterator<String> it = empList.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
