package hackerrank.introduction.programs;

public class Helloworld {

	
	/**You must print two lines of output:
	 * Print Hello, World. on the first line.
	 * Print Hello, Java. on the second line.
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		//1
		System.out.println("Hello, World.");
		System.out.println("Hello, Java.");
		
		//2
		System.out.print("Hello, World.");
		System.out.println();
		System.out.print("Hello, Java.");
		System.out.println();
		
		//3
		System.out.printf("Hello, World.%nHello, Java.%n");
		
		//4
		System.out.print("Hello, World.");
		System.out.print('\n');
		System.out.print("Hello, Java.");
		System.out.print('\n');
		
		//5
		String lineSeparator = System.getProperty("line.separator");
		System.out.printf("Hello, World."+lineSeparator+"Hello, Java."+lineSeparator);
		
		
		//6
		String nextLine = System.lineSeparator();
		System.out.printf("Hello, World."+nextLine+"Hello, Java."+nextLine);
	}

}
