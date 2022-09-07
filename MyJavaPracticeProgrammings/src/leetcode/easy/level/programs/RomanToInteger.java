package leetcode.easy.level.programs;

import java.io.ObjectOutputStream.PutField;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger {
	
	private static final Map<Character, Integer> romanToIntMap= new HashMap<Character, Integer>(){
		{
			put('I',1);
			put('V',5);
			put('X',10);
			put('L',50);
			put('C',100);
			put('D',500);
			put('M',1000);
		}
	};
		
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter roman number: ");
		String romanNumber = sc.nextLine();
		
		System.out.println(convertRomanToInteger(romanNumber));
		
	}
	
	public static int convertRomanToInteger(String romanNumber) {
		romanNumber= romanNumber.replace("IV","IIII");
		romanNumber= romanNumber.replace("IX","VIIII");
		romanNumber= romanNumber.replace("XL","XXXX");
		romanNumber= romanNumber.replace("XC","LXXXX");
		romanNumber= romanNumber.replace("CD","CCCC");
		romanNumber= romanNumber.replace("CM","DCCCC");
		//System.out.println(romanNumber);
		
		int intNumber=0;
		for(int i=0; i<romanNumber.length(); i++) {
			intNumber = intNumber+romanToIntMap.get(romanNumber.charAt(i));
		}
		return intNumber;
		
	}

}
