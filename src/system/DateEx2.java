package system;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx2 {
	public static void main(String[] args) {
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
		System.out.println(f.format(new Date()));

		Date d = new Date();

		System.out.println(d.getDate());
		System.out.println(d.getDay());
		System.out.println(d.getMonth());
		System.out.println(d.getYear());
		System.out.println(d.getHours());
		System.out.println(d.getMinutes());
		System.out.println(d.getSeconds());

	}
}
