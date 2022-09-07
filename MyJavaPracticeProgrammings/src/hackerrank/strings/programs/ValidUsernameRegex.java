package hackerrank.strings.programs;

import java.util.Scanner;

public class ValidUsernameRegex {

	 private static final Scanner scan = new Scanner(System.in);
	 private static   String regularExpression = "^[A-Za-z][A-Za-z0-9_]{7,29}$";
	    public static void main(String[] args) {
	        int n = Integer.parseInt(scan.nextLine());
	        while (n-- != 0) {
	            String userName = scan.nextLine();

	            if (userName.matches(regularExpression)) {
	                System.out.println("Valid");
	            } else {
	                System.out.println("Invalid");
	            }           
	        }
	    }

}
