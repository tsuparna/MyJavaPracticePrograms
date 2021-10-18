package com.stark.pyramid.programs;

import java.util.Scanner;

public class PrintNumberPyramids {

	public static void main(String args[]){
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of lines : ");
		number = sc.nextInt();
		
		printRightUpSideHalfNumberPyramid(number);
		printLeftUpSideHalfNumberPyramid(number);
		printFullUpSideNumberPyramid(number);
		
		printRightDownSideHalfNumberPyramid(number);
		printLeftDownSideHalfNumberPyramid(number);
		printFullDownSideNumberPyramid(number);
	}
	
	public static void printRightUpSideHalfNumberPyramid(int number){
		for(int i=1; i<=number; i++){
			for(int j=1; j<=i; j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
	}
	
	public static void printLeftUpSideHalfNumberPyramid(int number){
		
		for(int i=1; i<=number; i++){
			for(int j=2*(number-i); j>=1; j--){
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++){
				System.out.print(k+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
	}

	public static void printFullUpSideNumberPyramid(int number){
	
		for(int i=1; i<=number; i++){
			for(int j=number-i; j>=1; j--){
				System.out.print(" ");
				
			}
			for(int k=1; k<=i; k++){
				System.out.print(k+" ");
				
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
	}

	
	public static void printRightDownSideHalfNumberPyramid(int number){
		for(int i=1; i<=number; i++){
			for(int j=i; j<=number; j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
	}
	
	
	public static void printLeftDownSideHalfNumberPyramid(int number){
		
		for(int i=number; i>=1; i--){
			for(int j=2*(number-i); j>=1; j--){
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++){
				System.out.print(k+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
	}
	
	public static void printFullDownSideNumberPyramid(int number){
		
		for(int i=1; i<=number; i++){
			for(int j=1; j<i; j++){
				System.out.print(" ");
				
			}
			for(int k=i; k<=number; k++){
				System.out.print(k+" ");
				
			}
			
			System.out.println();
		}
	}
}
