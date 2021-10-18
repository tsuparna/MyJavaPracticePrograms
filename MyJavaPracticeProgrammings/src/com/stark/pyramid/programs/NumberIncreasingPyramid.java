package com.stark.pyramid.programs;

import java.util.Scanner;

public class NumberIncreasingPyramid {
	
	public static void main(String args[]){
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of lines : ");
		number = sc.nextInt();
		
		numberIncreasingPyramid(number);
		
	}
	
	public static void numberIncreasingPyramid(int number){
		for(int i=1; i<=number; i++){
			
			for(int j=(number-i); j>=1; j--){
				System.out.print("  ");
			}
			
			int temp1=i;
			for(int k=1; k<=i; k++){
				System.out.print(temp1+" ");
				temp1++;
			}
			
			int temp2= temp1-2;
			for(int k=1; k<=i-1; k++){
				System.out.print(temp2+" ");
				temp2--;
			}
			System.out.println();
		}
	}

}
