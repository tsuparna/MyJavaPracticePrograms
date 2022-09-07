package hakerrank.data.structures.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {

	public static void main(String[] args) {
		List<Integer> numberList = new ArrayList<Integer>();
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		for(int i=0; i<n; i++) {
			numberList.add(sc.nextInt());
		}
		
		int numOfQueries=sc.nextInt();
		
		for(int i=1; i<=numOfQueries; i++) {
			sc.nextLine();
			String query = sc.nextLine();
			if(query.equalsIgnoreCase("Insert")) {
				int index=sc.nextInt();
				int value=sc.nextInt();
				numberList.add(index, value);
				//System.out.println("numberList: "+numberList);
			}else if(query.equalsIgnoreCase("Delete")) {
				int deleteIndex=sc.nextInt();
				numberList.remove(deleteIndex);
				//System.out.println("numberList: "+numberList);
			}else {
				System.out.println("invalid query...");
			}
		}
		
		for(int number:numberList) {
			System.out.print(number+" ");
		}
		
		

	}

}
