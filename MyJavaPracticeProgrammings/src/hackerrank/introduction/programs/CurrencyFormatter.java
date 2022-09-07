package hackerrank.introduction.programs;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double payment = scanner.nextDouble();
		scanner.close();

		String us, india, china, france;

		NumberFormat formatter=NumberFormat.getCurrencyInstance(Locale.US); 
		us =  formatter.format(payment);
		formatter=NumberFormat.getCurrencyInstance(new Locale("en", "IN")); 
		india =  formatter.format(payment);
		formatter=NumberFormat.getCurrencyInstance(Locale.CHINA); 
		china =  formatter.format(payment);
		formatter=NumberFormat.getCurrencyInstance(Locale.FRANCE); 
		france =  formatter.format(payment);

		System.out.println("US: " + us);
		System.out.println("India: " + india);
		System.out.println("China: " + china);
		System.out.println("France: " + france);

	}

}
