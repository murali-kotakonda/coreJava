package system;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author I335484
 
1.create string with date
2.specify the input date format 
3.create the SimpleDateFormat object using the date format
4.call the parse() method using SimpleDateFormat object  by passing the string


format--> date obj to str
prase --> string tio date obj

 */
public class D3StringToDate {
	public static void main(String[] args) throws ParseException {
		String dateFormat = "dd-M-yyyy hh:mm:ss";
		String inputDate = "31-11-2001 11:12:56";
		
		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
		String dateInString = inputDate;
		Date date = sdf.parse(dateInString);
		System.out.println(date);
	}
}
