package oops.poly;

public class TestData {
	public static void main(String[] args) {
		Data data = new Data();
		 
		Person p = new Person();
		data.save(p);
		
		
		data.save("hello");
		
 	}
}
