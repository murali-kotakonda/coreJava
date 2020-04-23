package oops.poly;

public class TestData {
	public static void main(String[] args) {
		Data cal = new Data();
		 
		Person p = new Person(100,"user1",12);
		cal.save(p);
		
		
		cal.save("hello");
		
		//cal.save(null);
		
		Person p1=null;
		cal.save(p1);
		
		String x= null;
		cal.save(x);
 	}
}
