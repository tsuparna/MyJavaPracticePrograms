package com.stark.number.programs;

import java.util.Scanner;

public class SwapTwoNumbers {
	
	public static void main(String args[]){
		
		int x,y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		x = sc.nextInt();
		System.out.println("Enter first number: ");
		y = sc.nextInt();
		
		swapTwoNumbersUsingTrirdVariable(x,y);
		swapTwoNumbersWithoutUsingThirdVariable(x,y);
				
	}

	
	public static void swapTwoNumbersUsingTrirdVariable(int x, int y){
		int temp;
		temp =x;
		x =y;
		y = temp;
		
		System.out.println("after swaping Two Numbers Using Trird Variable: x="+x+" y="+y);
	}
	
	public static void swapTwoNumbersWithoutUsingThirdVariable(int x, int y){
		
		x= x+y;
		y = x-y;
		x = x-y;
		System.out.println("after swaping Two Numbers without using Trird Variable: x="+x+" y="+y);
	}
}
