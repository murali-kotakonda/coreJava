package oops.objs;

public class TestPerson {

	public static void main(String[] args) {
		//create the obj
		Person p1 = new Person();
		int x=90;
		
		//set the data
		p1.id=1200;
		p1.age=23;
		p1.name ="kumar";
		
		//show data
		System.out.println(p1.id);
		System.out.println(p1.age);
		System.out.println(p1.name);
		
	}
}
