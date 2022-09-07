package hackerrank.introduction.programs;

import java.util.Scanner;

public class IfElse {

	 private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();
        
        
        if(N%2==1) {
        	System.out.println("Weird");
        }else if(N%2==0) {
        	if((N>=2 && N<5) || (N>20)) {
        		System.out.println("Not Weird");
        	}else {
        		System.out.println("Weird");
        	}
        }

	}

}
