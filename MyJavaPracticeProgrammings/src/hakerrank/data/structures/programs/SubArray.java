package hakerrank.data.structures.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numberList = new ArrayList<Integer>();
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		for(int i=0; i<n; i++) {
			numberList.add(sc.nextInt());
		}
		System.out.println("numberList: "+numberList);
		
		int count=0, sum;
		/*for(int i=0; i<n; i++) {
			for(int j=i; j<n; j++) {
				sum=0;
				for(int k=i; k<=j; k++) {
					sum=sum+numberList.get(k);
					System.out.println(numberList.get(k)+"sum: "+sum);
					
				}
				if(sum<0) {
					System.out.println("["+i+":"+j+"]");
					count++;
				}
				
			}
		}*/
		
		 for (int i = 0; i < numberList.size(); i++) {
	            sum = 0;
	            for (int j = i; j < numberList.size(); j++) {
	                sum += numberList.get(j);
	                if (sum < 0) {
	                    count++;
	                }
	            }
	        }
		
		
		System.out.println("count: "+count);

	}

}
