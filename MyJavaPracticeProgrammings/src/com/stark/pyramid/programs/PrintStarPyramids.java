package com.stark.pyramid.programs;

import java.util.Scanner;

public class PrintStarPyramids {
	
	public static void main(String args[]){
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of lines : ");
		number = sc.nextInt();
		
		printRightUpSideHalfStarPyramid(number);
		printLeftUpSideHalfStarPyramid(number);
		printFullUpSideStarPyramid(number);
		
		printRightDownSideHalfStarPyramid(number);
		printLeftDownSideHalfStarPyramid(number);
		printFullDownSideStarPyramid(number);
	}
	
	public static void printRightUpSideHalfStarPyramid(int number){
		for(int i=0; i<number; i++){
			for(int j=0; j<=i; j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
	}
	
	public static void printLeftUpSideHalfStarPyramid(int number){
		
		for(int i=0; i<number; i++){
			for(int j=2*(number-i); j>=1; j--){
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++){
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
	}

	public static void printFullUpSideStarPyramid(int number){
	
		for(int i=0; i<number; i++){
			for(int j=number-i; j>1; j--){
				System.out.print(" ");
				
			}
			for(int k=0; k<=i; k++){
				System.out.print("* ");
				
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
	}

	
	public static void printRightDownSideHalfStarPyramid(int number){
		for(int i=0; i<number; i++){
			for(int j=i; j<number; j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
	}
	
	
	public static void printLeftDownSideHalfStarPyramid(int number){
		
		for(int i=number; i>=1; i--){
			for(int j=2*(number-i); j>=1; j--){
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++){
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
	}
	
	public static void printFullDownSideStarPyramid(int number){
		
		for(int i=1; i<=number; i++){
			for(int j=1; j<i; j++){
				System.out.print(" ");
				
			}
			for(int k=i; k<=number; k++){
				System.out.print("* ");
				
			}
			
			System.out.println();
		}
	}
}
