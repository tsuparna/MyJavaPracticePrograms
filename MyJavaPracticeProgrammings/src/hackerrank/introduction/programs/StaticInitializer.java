package hackerrank.introduction.programs;

import java.util.Scanner;

public class StaticInitializer {

	
	static int B, H;
	static boolean flag=true;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		B=sc.nextInt();
		H=sc.nextInt();
		
		if(B<=0 || H<=0){
	        System.out.println("java.lang.Exception: Breadth and height must be positive");
	        flag = false;
	    }else{
	        //System.out.println(H);
	    }
	}

}
