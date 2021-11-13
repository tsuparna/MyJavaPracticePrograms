package com.stark.string.programs;

import java.util.Scanner;

public class PerfectSubString {
	
	/*
	 * A string s comprised of digits from 0 to 9 contains a perfect substring
	 * if all the elements withing a substring occur exactly k times.
	 * calculate the number of perfect substrings in s.
	 * 
	 * s=1102021222
	 * k=2
	 * the 6 perfect substrings are:
	 * 1.s[0:1]=11
	 * 2.s[0:5]= 110202
	 * 3. s[1:6] = 102021
	 * 4. s[2:5]= 0202
	 * 5. s[7:8] = 22
	 * 6. s[8:9]= 22
	 * */
	
public static void main(String args[]){
		
		String inputString;
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter a string/number: ");
		inputString = sc.nextLine();
		System.out.println("Enter the k times: ");
		int k = sc.nextInt();
		System.out.println("Perfect substring count: "+ perfectSubString(inputString,k));
	}

 	static int perfectSubString(String inputString, int k){
 		int perfectSubStringCount = 0;
 		
 		for(int i=0; i<inputString.length(); i++){
 			int[] arr = new int[10];
 			for(int j=i; j<inputString.length(); j++){
 				if(j>i+(10*k)){
 					break;
 				}
 				
 				char ch =inputString.charAt(j);
 				arr[ch-'0']++;
 				if(check(arr, k)){
 					perfectSubStringCount++;
 				}
 			}
 		}
 		return perfectSubStringCount;
 	}
 	
 	static boolean check(int[]arr, int k){
 		for(int val: arr){
 			if(val!=0 && val!=k){
 				return false;
 			}
 		}
 		return true;
 	}

}
