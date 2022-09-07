package hackerrank.strings.programs;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokens {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        String s = scan.nextLine();
	        // Write your code here.
	        scan.close();
	        
	        printUsingTokenizer(s);
	        printUsingSplit(s);

	}
	
	//1, using tokenizer
	public static void printUsingTokenizer(String s) {
		 StringTokenizer st = new StringTokenizer(s," !,?._'@");
	        System.out.println(st.countTokens());    
	        while(st.hasMoreElements()){    
	             System.out.println(st.nextToken());    
	        }    
	}
	
	//2. using split
	public static void printUsingSplit(String s) {
		 //String strArray[] = s.split("[\\s,!?._'@]+");
		String strArray[] = s.split("[^A-Za-z]+");
		System.out.println(strArray.length); 
		for(String str: strArray) {
			System.out.println(str);  
		}
	}
}
