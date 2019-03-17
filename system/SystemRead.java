package system;

import java.util.Date;

public class SystemRead {
	public static void main(String[] args) {
		long currentTimeMillis = System.currentTimeMillis();
		Date date = new Date(currentTimeMillis);
		System.out.println(date); // prints 2013-08-05

		long nanoTime = System.nanoTime();
		System.out.println("Current nano time=" + nanoTime);
		
		long endTime = System.currentTimeMillis();
		System.out.println("time take = "+ (endTime-currentTimeMillis));
		
	}
}
