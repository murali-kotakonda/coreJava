package oops.methodEx;

public class TestPersonCopy {
	public static void main(String[] args) {
		//create obj
		Person p = new Person();

		//assign values
		p.id= 2009;
		p.name="user1";
		p.age=24;
		
		Person p1 =  p;
		
		p1.id= 2010;
		p1.name="user2";
		p1.age=25;
		
		//access values
		
		System.out.println(p.id);
		System.out.println(p.name);
		System.out.println(p.age);

		
		
		System.out.println(p1.id);
		System.out.println(p1.name);
		System.out.println(p1.age);


		
	}
}
