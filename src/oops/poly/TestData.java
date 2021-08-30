2package oops.poly;

public class TestData {
	public static void main(String[] args) {
		Data d = new Data();
		d.save("hello");
		
		//as the save method expects person obj , we need to create the person obj
		Person p = new Person();
		d.save(p);
		
 	}
}
