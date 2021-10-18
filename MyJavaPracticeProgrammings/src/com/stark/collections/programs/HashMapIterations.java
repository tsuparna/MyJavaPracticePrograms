package com.stark.collections.programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapIterations {
	
	public static void main(String args[]){
		
		//no order - no indexing
		//stores values --key-value <k,v>
		//key can not be duplicate
		//can store n number of null values but only one null key
		
		HashMap<String, Integer> stuMarkes = new HashMap<String, Integer>();
		stuMarkes.put("suparna", 89);
		stuMarkes.put("vaishali", 90);
		stuMarkes.put("sagar", 98);
		stuMarkes.put("vaishnavi", 94);
		stuMarkes.put("kranti", 99);
		stuMarkes.put("kranti", 100);
		stuMarkes.put(null, 92);
		stuMarkes.put("kk", null);
		stuMarkes.put("stark", null);
		
		System.out.println(stuMarkes.get("suparna"));
		System.out.println(stuMarkes.get("kranti"));
		System.out.println(stuMarkes.get(null));
		System.out.println(stuMarkes.get("kk"));
		System.out.println(stuMarkes.get("stark"));
		System.out.println("-------------------------------------------------");
		//iterator: over the keys: by using keyset()
		Iterator<String> it = stuMarkes.keySet().iterator();
		while(it.hasNext()){
			String key = it.next();
			Integer value = stuMarkes.get(key);
			System.out.println("key: "+ key +"  ::  value: "+ value);
			
		}
		
		System.out.println("-------------------------------------------------");
		//iterator: over the set (pair): by using entrySet
		Iterator<Entry<String, Integer>> iterate = stuMarkes.entrySet().iterator();
		
		while(iterate.hasNext()){
			Entry<String, Integer> entry = iterate.next();
			System.out.println("key: "+ entry.getKey() +"  ::  value: "+ entry.getValue());
		}
		
		System.out.println("-------------------------------------------------");
		
		//iterate hashMap using java 8 for each and lambda:
		stuMarkes.forEach((k,v) -> System.out.println("key: "+ k +"  ::  value: "+ v));
		
		
		System.out.println("-------------------------------------------------");
	}

}
