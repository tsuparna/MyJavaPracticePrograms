package com.stark.number.programs;

import java.util.Scanner;

public class ArmstrongNumber {

	//what is ArmstrongNumber Ex:
	//153 = 1*1*1 + 5*5*5 + 3*3*3 = 1+125+27 = 153
	//1634 = 1*1*1*1 + 6*6*6*6 + 3*3*3*3 + 4*4*4*4 = 1634
	
	
	public static void main(String args[]){
		
		int count =0, multiplier, temp;
		
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		number = sc.nextInt();
		
		temp= number;
		int length = Integer.toString(number).length();
		while(number>0){
			multiplier = number%10;
			number = number/10;
			int num = multiplier;
			for(int i =1; i<length; i++){
				num = num*multiplier;
				System.out.println(num);
			}
			count = count+num;
		}
		if(temp==count){
			System.out.println("Armstrong number : "+ count);
		}else{
			System.out.println("Not armstong number : "+ count);
		}
	}
}
