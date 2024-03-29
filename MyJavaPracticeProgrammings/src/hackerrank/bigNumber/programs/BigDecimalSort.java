package hackerrank.bigNumber.programs;

import java.util.Comparator;
import java.util.Scanner;
import java.math.BigDecimal;

public class BigDecimalSort {

	public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        //Write your code here
       String temp;
        BigDecimal bd1;
        BigDecimal bd2;
        for(int i=1; i<n; i++) {
            for(int j=i; j>=1; j--) {
                bd1 = new BigDecimal(s[j]);
                bd2= new BigDecimal(s[j-1]);
                
                if(bd1.compareTo(bd2)>0) {
                    temp = s[j];
                    s[j]=s[j-1];
                    s[j-1]=temp;
                }else {
                    break;
                }
            }
            
        }
        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}
