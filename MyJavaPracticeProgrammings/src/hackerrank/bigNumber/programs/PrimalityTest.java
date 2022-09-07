package hackerrank.bigNumber.programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class PrimalityTest {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String n = bufferedReader.readLine();
		bufferedReader.close();
		findIsPrimeUsingForloop(n);
		findIsPrimeUsingBigInteger(n);
		
	}
	
	//1
	public static void findIsPrimeUsingForloop(String n) throws IOException{
		int number = Integer.parseInt(n);
		int count=2;
		for(int i=2; i<number; i++) {
			if(number%i==0) {
				count=count+1;
			}
		}
		System.out.println(count);
		if(count==2) {
			System.out.println("prime");
		}else {
			System.out.println("not prime");
		}
	}
	
	//2
	public static void findIsPrimeUsingBigInteger(String n) throws IOException{
		BigInteger number = new BigInteger(n);
		System.out.println(number.isProbablePrime(100) ? "prime" : "not prime");
		
	}

}
