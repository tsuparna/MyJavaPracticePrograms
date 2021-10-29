package com.stark.number.programs;

import java.util.ArrayList;
import java.util.Scanner;

public class FizzBuzz {

	public static void main(String args[]){
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		number = sc.nextInt();
		
		fizzBuzz(number);
		fizzBuzzBetterImplimentation(number);
	}

	public static void fizzBuzz(int number){
		String temp;
		for(int i=1; i<=100; i++){
			if(i%3==0 && i%5==0){
				temp = "FizzBuzz";
			}else if(i%3 == 0){
				temp = "fizz";
			}else if(i%5 == 0){
				temp = "Buzz";
			}else{
				temp = String.valueOf(i);
			}
			System.out.print(temp + ", ");
		}
		System.out.println();
	}
	
	public static void fizzBuzzBetterImplimentation(int number){
		ArrayList<String> fizzBuzzList = new ArrayList<String>();
		String temp;
		for(int i=1; i<=100; i++){
			if(i%15==0){
				temp = "FizzBuzz";
			}else if(i%3 == 0){
				temp = "fizz";
			}else if(i%5 == 0){
				temp = "Buzz";
			}else{
				temp = String.valueOf(i);
			}
			fizzBuzzList.add(temp);
		}
		System.out.println(fizzBuzzList);
		
	}
}
