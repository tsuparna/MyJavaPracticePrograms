package hackerrank.introduction.programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiplicationTableLoops_I {
	
	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        bufferedReader.close();
        
        printUsingForLoop(N);
        printUsingWhileLoop(N);
        }
	
	//1
	public static void printUsingForLoop(int N) {
		 if((N>=2) &&(N<=20)) {
	        	//1
	        	for(int i=1; i<=10; i++) {
	        		System.out.println(N+" x "+i+" = "+(N*i));
	        	}
		 }
	}
	
	//2
	public static void printUsingWhileLoop(int N) {
		 if((N>=2) &&(N<=20)) {
			 int j=1;
	        	while(j<=10) {
	        		System.out.println(N+" x "+j+" = "+(N*j));
	        		j++;
	        	}
		 }
	}

}
