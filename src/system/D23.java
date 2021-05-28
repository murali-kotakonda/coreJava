package system;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class D23 {

	public static void main(String[] args) throws ParseException{
		 
		    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
		    Date firstDate = sdf.parse("01/05/2021");
		    Date secondDate = new Date();

		    long diffInMillies = Math.abs(secondDate.getTime() - firstDate.getTime());
		    long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
		    System.out.println("days ="+diff);
		}	
	
	public static String getDate() {
		Date dateObj = new Date();
		
		String pattern = "dd/MM/yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		
		String date = simpleDateFormat.format(dateObj);
		return date;
	}
	
	
	
}
