package com.stark.number.programs;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String args[]){
		
		System.out.println("is 17 prime? "+ isPrime(17));
		System.out.println("is 27 prime? "+ isPrime(27));
		System.out.println("is 83 prime? "+ isPrime(83));
		
		int startNumber, endNumber;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter starting number: ");
		startNumber = sc.nextInt();
		System.out.println("Enter end number: ");
		endNumber = sc.nextInt();
		printPrimeNumbersBetweenGivenInputs(startNumber, endNumber);
	}
	
	public static boolean isPrime(int number){
		
		if(number<=1){
			return false;
		}else{
			for(int i=2; i<=Math.sqrt(number); i++){
				
				if(number%i == 0){
					return false;
				}
			}
			return true;
		}
	}
	
	public static void printPrimeNumbersBetweenGivenInputs(int minNumber, int maxNumber){
		System.out.println("prime Numbers: ");
		if(minNumber <1 || maxNumber< minNumber){
			System.out.println("Please enter valid inputs");
		}
		for(int i= minNumber; i<=maxNumber; i++){
			int count =0;
			for(int j=1; j<=i; j++){
				if(i%j == 0){
					count++;
				}
			}
			if(count ==2){
				System.out.print(i+" ");
			}
		}
	}

}
