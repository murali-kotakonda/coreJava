package system;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SystemRead {
	public static void main(String[] args) {
		long currentTimeMillis = System.currentTimeMillis();
		Date date = new Date(currentTimeMillis);

		String pattern = "yyyy-MM-dd'T'HH:mm:ssZ";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

		String dateStr = simpleDateFormat.format(date);
		System.out.println(dateStr);
		
		
		long nanoTime = System.nanoTime();
		System.out.println("Current nano time=" + nanoTime);
		
		long endTime = System.currentTimeMillis();
		System.out.println("time take = "+ (endTime-currentTimeMillis));
		
	}
}
