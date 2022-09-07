package hackerrank.introduction.programs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateAndTime {

	 public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

	        int month = Integer.parseInt(firstMultipleInput[0]);

	        int day = Integer.parseInt(firstMultipleInput[1]);

	        int year = Integer.parseInt(firstMultipleInput[2]);

	        String res = DateAndTime.findDay(month, day, year);

	        bufferedWriter.write(res);
	        bufferedWriter.newLine();

	        bufferedReader.close();
	        bufferedWriter.close();
	    }
	 
	 
	 //1
	 public static String findDay(int month, int day, int year) {
	        String dayString=null;
	        try{
	            String input = String.valueOf(day)+"/"+String.valueOf(month)+"/"+String.valueOf(year);
	            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");  
	            Date date= sdf.parse(input);  
	            DateFormat df = new SimpleDateFormat("EEEE"); 
	            dayString = df.format(date);
	           
	        }catch(Exception e){
	            
	        }
	        return dayString.toUpperCase();
	    }
	 
	 //2
	 public static String findDay1(int month, int day, int year) {
	        Calendar cal = Calendar.getInstance();
	        cal.set(Calendar.MONTH,month-1);
	        cal.set(Calendar.DAY_OF_MONTH,day);
	        cal.set(Calendar.YEAR,year);
	        String dayOfWeek = cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();
	        return dayOfWeek;
	    }

}
