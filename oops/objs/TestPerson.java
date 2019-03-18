package oops.objs;

public class TestPerson {
	public static void main(String[] args) {
		
		//create obj
		Person p = new Person();
		
		//assign values
		p.id= 2009;
		p.name="user1";
		p.age=24;
		
		//access values
		System.out.println(p.id);
		System.out.println(p.name);
		System.out.println(p.age);
		
		
	}
}
