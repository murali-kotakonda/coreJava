package system;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
public static void main(String[] args) {
	String pattern = "yyyy-MM-dd";
	SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

	String date = simpleDateFormat.format(new Date());
	System.out.println(date);	
}
}
