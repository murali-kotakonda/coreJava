package system;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
public static void main(String[] args) {
	//SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ");
	/*dd-MM-yy	31-01-12
	dd-MM-yyyy	31-01-2012
	MM-dd-yyyy	01-31-2012
	yyyy-MM-dd	2012-01-31
	yyyy-MM-dd HH:mm:ss	2012-01-31 23:59:59
	yyyy-MM-dd HH:mm:ss.SSS	2012-01-31 23:59:59.999
	yyyy-MM-dd HH:mm:ss.SSSZ	2012-01-31 23:59:59.999+0100
	EEEEE MMMMM yyyy HH:mm:ss.SSSZ	Saturday November 2012 10:45:42.720+0100*/
	String pattern = "yyyy-MM-dd";
	SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

	String date = simpleDateFormat.format(new Date());
	System.out.println(date);	
}
}
