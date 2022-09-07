package hackerrank.introduction.programs;

import java.util.Scanner;

public class OutputFormatting {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("================================");
		for(int i=0;i<3;i++)
		{
			String s1=sc.next();
			int x=sc.nextInt();
			if(s1.length()<=10 && (x>=0 && x<=999)) {
				System.out.print(s1);
				for(int j=s1.length();j<=10; j++) {
					System.out.print(" ");
				}
				System.out.print("    ");

				if(x<10) {
					System.out.print("00"+x);
				}else if(x<100) {
					System.out.print("0"+x);
				}else {
					System.out.print(x);
				}
			}
			System.out.println();
		}
		System.out.println("================================");

	}
}
