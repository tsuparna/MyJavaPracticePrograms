package com.stark.number.programs;

import java.util.Scanner;

public class CountProperFraction {
	
	/*Consider the fraction, n/d, where n and d are positive integers. 
	 * if n<d and HCF(n,d)==1. 
	 * it is called a reduced proper fraction.(HCF=Highest common Factor). 
	 * if we list the set of reduced proper fractions for d<=8 in ascending order size. we get:
	 * 1/8, 1/7, 1/6, 1/5, 1/4, 2/7, 1/3, 3/8, 2/5,
	 * 3/7, 1/2, 4/7, 3/5, 5/6, 2/3, 5/7, 3/4, 4/5, 
	 * 5/6, 6/7, 7/8
	 * 
	 * it can be seen that there are 21 elements in this set. 
	 * write a program to count the number of proper fractions for a given number d*/
	
public static void main(String args []){
		
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		number = sc.nextInt();
		
		System.out.println("Number of proper fractions for given number: "+ countProperFractions(number));
		
	}

 static int countProperFractions(int number){
	 int count =0;
	 
	 int[] phi = new int[number+1];
	 for(int i=0; i<phi.length; i++){
		 phi[i] = i;
		 
	 }
	 
	 for(int i=2; i<=number; i++){
		 if(phi[i]==i){
			 for(int k=1; k*i<=number; k++){
				 phi[k*i] -=phi[k*i]/i;
			 }
		 }
	 }
	 
	 long[] sums = new long[phi.length];
	 for(int i=2; i<=number; i++){
		 sums[i] = sums[i-1]+ phi[i];
	 }
	 count = (int)sums[number];
	 return count;
 }
}
