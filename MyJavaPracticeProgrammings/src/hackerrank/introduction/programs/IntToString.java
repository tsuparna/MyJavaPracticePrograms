package hackerrank.introduction.programs;

import java.security.Permission;
import java.util.Scanner;

public class IntToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 DoNotTerminate.forbidExit();

		  try {
		   Scanner in = new Scanner(System.in);
		   int n = in .nextInt();
		   in.close();
		   //String s=???; Complete this line below
		    String s = Integer.toString(n);
		   //Write your code here

		   
		   if (n == Integer.parseInt(s)) {
		    System.out.println("Good job");
		   } else {
		    System.out.println("Wrong answer.");
		   }
		  } catch (DoNotTerminate.ExitTrappedException e) {
		   System.out.println("Unsuccessful Termination!!");
		  }
		 }
		}

		//The following class will prevent you from terminating the code using exit(0)!
		class DoNotTerminate {

		 public static class ExitTrappedException extends SecurityException {

		  private static final long serialVersionUID = 1;
		 }

		 @SuppressWarnings("removal")
		public static void forbidExit() {
		  @SuppressWarnings("deprecation")
		final SecurityManager securityManager = new SecurityManager() {
		   @Override
		   public void checkPermission(Permission permission) {
		    if (permission.getName().contains("exitVM")) {
		     throw new ExitTrappedException();
		    }
		   }
		  };
		  System.setSecurityManager(securityManager);
		 }
		}
