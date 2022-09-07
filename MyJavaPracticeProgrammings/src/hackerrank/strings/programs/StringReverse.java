package hackerrank.strings.programs;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        
        String reverseStr = printReverseStringUsingForLoop(A);;
       
        if(reverseStr.equals(A)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

	}
	
	public static String printReverseStringUsingForLoop(String inputString){
		
		String reverseString="";
		int length = inputString.length();
		
		for(int i=length-1; i>=0; i--){
			reverseString = reverseString + inputString.charAt(i);
		}
		return reverseString;
	}

}
