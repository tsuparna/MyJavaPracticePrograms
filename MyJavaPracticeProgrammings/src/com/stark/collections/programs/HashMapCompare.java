package com.stark.collections.programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class HashMapCompare {
	
	public static void main(String args[]){
		
		HashMap<Integer, String> hashMap1 = new HashMap<Integer, String>();
		hashMap1.put(1, "A");
		hashMap1.put(2, "B");
		hashMap1.put(3, "C");
		hashMap1.put(4, "D");
		
		HashMap<Integer, String> hashMap2 = new HashMap<Integer, String>();
		hashMap2.put(2, "B");
		hashMap2.put(1, "A");
		hashMap2.put(4, "D");
		hashMap2.put(3, "C");
		
		HashMap<Integer, String> hashMap3 = new HashMap<Integer, String>();
		hashMap3.put(2, "B");
		hashMap3.put(1, "A");
		hashMap3.put(4, "D");
		hashMap3.put(3, "C");
		hashMap3.put(5, "E");
		
		
		//1. on the basis of key-value; use equals method
		System.out.println(hashMap1.equals(hashMap2));
		System.out.println(hashMap1.equals(hashMap3));
		
		//2. compare hashmaps for the same keys: keySet()
		System.out.println(hashMap1.keySet().equals(hashMap2.keySet()));
		System.out.println(hashMap1.keySet().equals(hashMap3.keySet()));
		
		HashMap<Integer, String> hashMap4 = new HashMap<Integer, String>();
		hashMap4.put(1, "A");
		hashMap4.put(2, "B");
		hashMap4.put(3, "C");
		hashMap4.put(4, "D");
		hashMap4.put(4, "E");
		
		//combine the keys from both the maps: using HashSet:
		HashSet<Integer> combineKeys = new HashSet<>(hashMap1.keySet());
		//add the keyset from hashmap4
		combineKeys.addAll(hashMap4.keySet());
		combineKeys.removeAll(hashMap1.keySet());
		System.out.println(combineKeys);
		
		
		//4. compare maps by values
		HashMap<Integer, String> hashMap5 = new HashMap<Integer, String>();
		hashMap5.put(1, "A");
		hashMap5.put(2, "B");
		hashMap5.put(3, "C");
		hashMap5.put(4, "D");
		
		HashMap<Integer, String> hashMap6 = new HashMap<Integer, String>();
		hashMap6.put(2, "B");
		hashMap6.put(1, "A");
		hashMap6.put(4, "D");
		hashMap6.put(3, "C");
		
		HashMap<Integer, String> hashMap7 = new HashMap<Integer, String>();
		hashMap7.put(2, "B");
		hashMap7.put(1, "A");
		hashMap7.put(4, "D");
		hashMap7.put(3, "C");
		hashMap7.put(5, "E");
		
		//1. duplicates are not allowed: using arraylist
		System.out.println(new ArrayList<>(hashMap5.values()).equals(new ArrayList<>(hashMap6.values())));
		System.out.println(new ArrayList<>(hashMap5.values()).equals(new ArrayList<>(hashMap7.values())));
		
		//2. duplicates are allowed: using hashSet
		System.out.println(new HashSet<>(hashMap5.values()).equals(new HashSet<>(hashMap6.values())));
		System.out.println(new HashSet<>(hashMap5.values()).equals(new HashSet<>(hashMap7.values())));
	}

}
