package com.stark.number.programs;

import java.util.Scanner;

public class DoubleBasePolindrome {
	
	/*Double base Palindrome as the name suggest is a number 
	 * which is Palindrome in 2 bases. One of the base is 10 i.e. 
	 * decimal and another base is k.(which can be 2 or others). 
	 * Note : The palindromic number, in either base, may not include leading zeros. 
	 * Example : The decimal number, 585 = 10010010012 (binary), is palindromic in both bases. 
	 * A Palindrome is a word, phrase, number, 
	 * or other sequence of characters which reads 
	 * the same backward as forward, such as madam or 12321.*/
	
	/*Input :  10 2
	 * Output : 25
	 * Explanation : (here n = 10 and k = 2)
	 * 1 3 5 7 9 (they are all palindrome 
	 * in base 10 and 2) so sum is :
	 * 1 + 3 + 5 + 7 + 9 = 25
	 * Input :  100 2
	 * Output : 157
	 * Explanation : 1 + 3 + 5 + 7 + 9 + 33 + 99 = 157*/
	
	
public static void main(String args []){
		
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		number = sc.nextInt();
		
		System.out.println("Number of proper fractions for given number: "+ getSumofDoubleBasePalindromes(number));
		
	}

	static int getSumofDoubleBasePalindromes(int number){
		int sum=0;
		for(int i=1; i<=number; i++){
			sum = sum+ isPlindrome(i);
		}
		return sum;
	}
	
	static int isPlindrome(int i){
		int temp =i;
		int j=0;
		while(temp>0){
			j = temp%10+ j*10;
			temp = temp/10;
		}
		
		if(j==i){
			String str1 = convertIntegerToString(j);
			StringBuilder sb = new StringBuilder(str1);
			String str2 = sb.reverse().toString();
			if(str1.equals(str2)){
				return i;
			}
		}
		return 0;
	}
	
	static String convertIntegerToString(int j){
		String str="";
		while(j>0){
			int digit = j%2;
			j=j/2;
			str = str+(char)(digit+'0');
			
		}
		return str;
	}

}
