package system;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class D55 {
	public static void main(String[] args) throws ParseException {
		// Convert Date to Calendar.
		SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		String dateInString = "22-01-2015 10:20:56";
		Date date = sdf.parse(dateInString);
        
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		
		//Calendar to date
		Calendar calendar1 = Calendar.getInstance();
        Date date1 =  calendar.getTime();
	}
}
