package system;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class D3StringToDate {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		String dateInString = "31-11-2001 11:12:56";
		Date date = sdf.parse(dateInString);
		System.out.println(date);
	}
}
