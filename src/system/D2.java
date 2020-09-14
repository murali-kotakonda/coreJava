package system;

import java.util.Date;
//compare two dates
// use before() method or after() method
public class D2 {
	public static void main(String[] args) {
		// Creating date
		Date d1 = new Date(2017, 1, 21);
		Date d2 = new Date(); 
		Date d3 = new Date(2020, 11, 3);

		System.out.println(d3.before(d2));  
		
		System.out.println(d3.after(d2));
		
		System.out.println(d2.before(d3));  
		
		System.out.println(d2.after(d3));
		
		
		
		System.out.println(d1.compareTo(d2));

		System.out.println("Miliseconds from Jan 1 " + "1970 to date d1 is " + d1.getTime());

		System.out.println("Before setting " + d2);
		d2.setTime(204587433443L);
		System.out.println("After setting " + d2);
	}
}
