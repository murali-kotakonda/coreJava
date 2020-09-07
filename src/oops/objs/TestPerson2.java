package oops.objs;

/**
 Req: 
 create two person objs
 set data and display data
 
 */
public class TestPerson2 {

	public static void main(String[] args) {
		//create the obj
		Person p1 = new Person();
		Person p2 = new Person();
		
		//set the data
		p1.id=1200;
		p1.age=23;
		p1.name ="kumar";
		
		p2.id=1300;
		p2.age=24;
		p2.name ="shyam";
		
		//show data
		System.out.println("***************show p1 data******************");
		System.out.println(p1.id);
		System.out.println(p1.age);
		System.out.println(p1.name);
		
		System.out.println("***************show p2 data******************");
		System.out.println(p2.id);
		System.out.println(p2.age);
		System.out.println(p2.name);
		
	}
}
