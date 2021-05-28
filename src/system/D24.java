package system;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class D24 {

	public static void main(String[] args) throws ParseException{
		 
			String input = "01-05-2021";
		    getFormat(input);

		}

	private   String  getFormat(String input) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
		Date firstDate = sdf.parse(input);
		
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		
		String date = simpleDateFormat.format(firstDate);
		return date;
	}	
}