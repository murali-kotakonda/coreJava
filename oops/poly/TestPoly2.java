package oops.poly;

import oops.abstraction.Person;

public class TestPoly2 {
	public static void main(String[] args) {
		Calculator2 cal = new Calculator2();
		 
		Person p = new Person();
		cal.save(p);
		cal.save("hello");
		
		//cal.save(null);
		
		Person p1=null;
		cal.save(p1);
		
		String x= null;
		cal.save(x);
 	}
}
