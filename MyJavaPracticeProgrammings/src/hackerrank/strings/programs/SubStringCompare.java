package hackerrank.strings.programs;

import java.util.Scanner;

public class SubStringCompare {
	
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String s = scan.next();
	    int k = scan.nextInt();
	    scan.close();

	    System.out.println(findSmallestAndLargest(s, k));
	}
	
	public static String findSmallestAndLargest(String s, int k) {
	    int n = s.length();
	    String smallest = s.substring(0,k);
	    String largest =s.substring(0,k);
	    for(int i = 0;i<n-k+1;i++){
	        String temp = s.substring(i,i+k);
	        largest = largest.compareTo(temp)>0?largest:temp;
	        smallest = smallest.compareTo(temp)<0?smallest:temp;
	    }

	    return smallest + "\n" + largest;
	}

}
