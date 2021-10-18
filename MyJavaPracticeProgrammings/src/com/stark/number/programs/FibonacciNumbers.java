package com.stark.number.programs;

import java.util.Scanner;

public class FibonacciNumbers {
	
	static int num1=0, num2 =1, nextNum=0;
	
	public static void main(String args []){
		
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		number = sc.nextInt();
		
		printFibonacciNumbersWithoutRecursion(number);
		printFibonacciNumbersWithRecursion(number);
		
	}

	public static void printFibonacciNumbersWithoutRecursion(int number){
		
		System.out.print("Fibonacci series till "+ number+": "+ num1+", "+num2);
		for(int i=2; i<number; ++i){
			System.out.print(", ");
			nextNum = num1+num2;
			System.out.print(nextNum);
			num1= num2;
			num2 = nextNum;
		}
		System.out.println();
	}
	
	public static void printFibonacciNumbersWithRecursion(int number){
		num1=0; num2 =1; nextNum=0;
		System.out.print("Fibonacci series till "+ number+": "+ num1+", "+num2);
		printFibonacci(number-2);
	}
	
	static void printFibonacci(int number){
		if(number > 0){
			System.out.print(", ");
			nextNum = num1+num2;
			System.out.print(nextNum);
			num1= num2;
			num2 = nextNum;
			printFibonacci(number-1);
		}
	}
}
