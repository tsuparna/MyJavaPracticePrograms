package leetcode.easy.level.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FizzBuzz {
	
	public static void main(String args[]){
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		number = sc.nextInt();
		
		List<String> fizzBuzzList = new ArrayList<String>();
		fizzBuzzList=fizzBuzz(number);
		System.out.println(fizzBuzzList.toString());
		fizzBuzzList= fizzBuzzBetterImplimentation(number);
		System.out.println(fizzBuzzList.toString());
	}
	
	//1
	public static List<String> fizzBuzz(int n) {
        List<String> output= new ArrayList<String>();
        for(int i=1; i<=n; i++){
            if((i%3==0) && (i%5==0)){
                output.add("FizzBuzz");
            }else if((i%3==0)){
                output.add("Fizz");
            }else if((i%5==0)){
                output.add("Buzz");
            }else{
                output.add(String.valueOf(i));
            }
            
        }
        return output;
    }
	
	//2
	public static List<String> fizzBuzzBetterImplimentation(int n) {
        List<String> output= new ArrayList<String>();
        for(int i=1; i<=n; i++){
            if((i%15==0)){
                output.add("FizzBuzz");
            }else if((i%3==0)){
                output.add("Fizz");
            }else if((i%5==0)){
                output.add("Buzz");
            }else{
                output.add(String.valueOf(i));
            }
            
        }
        return output;
    }

}
