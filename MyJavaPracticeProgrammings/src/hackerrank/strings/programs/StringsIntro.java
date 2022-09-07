package hackerrank.strings.programs;

import java.util.Scanner;

public class StringsIntro {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
       
        //1
        System.out.println(A.length()+B.length());
        
        System.out.println( (A.charAt(0)>B.charAt(0)) ? "Yes" : "No" );
        
        System.out.println(A.substring(0,1).toUpperCase() + A.substring(1).toLowerCase()+ " "+
        		B.substring(0,1).toUpperCase() + B.substring(1).toLowerCase());
        
        
        //2
        int lengthOfA= A.length();
        int lengthOfB= B.length();
        System.out.println(lengthOfA+lengthOfB);
        
        if(A.charAt(0)>B.charAt(0)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    
        System.out.println(A.substring(0,1).toUpperCase() + A.substring(1).toLowerCase()+ " "+
        B.substring(0,1).toUpperCase() + B.substring(1).toLowerCase());

	}

}
