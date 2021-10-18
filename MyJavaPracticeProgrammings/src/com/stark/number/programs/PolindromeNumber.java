package com.stark.number.programs;

import java.util.Scanner;

public class PolindromeNumber{
	
	public static void main(String args[]){
		
		int remainder, sum=0, temp;
		int inputNumber;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input number: ");
		inputNumber = sc.nextInt();
		System.out.println("input number: "+ inputNumber);
		
		temp=inputNumber;
		
		while(inputNumber>0){
			remainder = inputNumber%10;
			sum=(sum*10)+remainder;
			inputNumber=inputNumber/10;
		}
		
		if(sum==temp){
			System.out.println(temp +": is plindrome number");
		}else{
			System.out.println(temp +": is not plindrome number");
		}
	}
	
}

