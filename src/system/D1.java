package system;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 Date operations:
---------------------
1.import java.util.Date;
2.create the date object
ex: Date d1 = new Date(); // point to currrent date and time
 
*/
public class D1 {
	public static void main(String[] args) {
		Date d1 = new Date();
		System.out.println("date is " + d1);
		
		System.out.println(System.currentTimeMillis());
		//1601709625989
		
		Date d2 = new Date(111111111111L); // create date using milliseconds
		System.out.println("Date is =" + d2);
		
		String europeanDatePattern = "dd/MM/yyyy HH:mm:ss";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(europeanDatePattern);
		ZonedDateTime parse = ZonedDateTime.parse("10/10/2020"+" 00:00:00",formatter.withZone(ZoneId.systemDefault()));
		System.out.println(parse);
	}
}