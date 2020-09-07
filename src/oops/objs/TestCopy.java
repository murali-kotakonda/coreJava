package oops.objs;

public class TestCopy {

	public static void main(String[] args) {
		
		
		
		Person p = new Person();
		p.id= 1234;
		p.name="user1";
		p.age= 34;
		
		Person p2 = p;
		p2.name= "user2";
		p2.age=18;
		
		System.out.println(p.name);
		System.out.println(p2.name);
		
	}
	
}
