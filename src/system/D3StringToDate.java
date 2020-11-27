package system;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
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
	public static void main1(String[] args) throws ParseException {
		Date date = getDate();
		System.out.println(date);
	}

	private static Date getDate() throws ParseException {
		String dateFormat = "dd-M-yyyy hh:mm:ss";
		String inputDate = "31-11-2001 11:12:56";
		//String pattern = "dd/MM/yy";
		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
		String dateInString = inputDate;
		Date date = sdf.parse(dateInString);
		return date;
	}
	
	
	private static Date getDate2(String dateStr, String format) {
		//String dateFormat = "dd-M-yyyy hh:mm:ss";
		//String inputDate = "31-11-2001 11:12:56";
		//String pattern = "dd/MM/yy";
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		Date date = sdf.parse(dateStr);
		return date;
	}
	
	
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, 0);
        calendar.set(Calendar.DATE, calendar.getActualMinimum(Calendar.DAY_OF_MONTH));
        Date monthFirstDay = calendar.getTime();
        calendar.set(Calendar.DATE, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
        Date monthLastDay = calendar.getTime();

    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
    String startDateStr = df.format(monthFirstDay);
    String endDateStr = df.format(monthLastDay);
    System.out.println(startDateStr);
    System.out.println(endDateStr);
	}
}
