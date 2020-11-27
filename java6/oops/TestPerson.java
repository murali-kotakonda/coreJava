package oops;

public class TestPerson {
	
	public static void main(String[] args) {
		//create obj
		
		Person p = new Person();
		// p is obj and p has memory for id,name,age
		
		//set data
		p.id = 12000;
		p.age= 23;
		p.name ="user1";
		
		//print data
		System.out.println(p.id);
		System.out.println(p.age);
		System.out.println(p.name);
		
		Person p1 = new Person();
		// p1 is obj and p1 has memory for id,name,age
		
		//set data
		p1.id = 13000;
		p1.age= 24;
		p1.name ="user2";
		
		//print data
		System.out.println(p1.id);
		System.out.println(p1.age);
		System.out.println(p1.name);
	}
}
