package com.stark.pyramid.programs;

import java.util.Scanner;

public class MirrorImageNumberPyramid {
	
	public static void main(String args[]){
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of lines : ");
		number = sc.nextInt();
		
		printMirrorImageNumberPyramid(number);
		
	}
	
	public static void printMirrorImageNumberPyramid(int number){
		
		for(int i=1; i<=number; i++){
			for(int j=1; j<i; j++){
				System.out.print(" ");
			}
			for(int k=i; k<=number; k++){
				System.out.print(k+" ");
			}
			System.out.println();
		}
		
		for(int i=number-1; i>=1; i--){
			for(int j=1; j<i; j++){
				System.out.print(" ");
			}
			for(int k=i; k<=number; k++){
				System.out.print(k+" ");
			}
			System.out.println();
		}
		
		
		System.out.println();
	}

}
