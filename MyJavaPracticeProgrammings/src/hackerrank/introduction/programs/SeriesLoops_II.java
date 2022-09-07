package hackerrank.introduction.programs;

import java.util.Scanner;

public class SeriesLoops_II {
	
	
	public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            if(t<500) {
            	int sum=a;
            	if((a<=50) && (a>=0) && (b<=50) && (b>=0)&& (n>=1) && (n<=15)) {
            		 for(int j=1; j<=n; j++) {
      	         	   sum+=Math.pow(2, j)*b;
      	         	   System.out.print(sum+" ");
     	            }
            		System.out.println();
            	}else {
            		System.out.println("Enter values with in given limits...");
            	}
	           
            }
        }
        in.close();
        
      
    }

}
