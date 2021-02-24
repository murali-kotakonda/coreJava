package oops.objscopy;

import oops.methodEx2.Person;

public class TestCopy {

	public static void main(String[] args) {
		
		int x = 20;
		int y =x; 
		y=35;
		System.out.println(x);
		System.out.println(y);
		
		
		

		// create obj
		Person p1 = new Person();
		p1.id = 1000;
		p1.name = "user1";
		p1.age = 30;

		//copy p2 to p1
		Person p2 = p1;
		// no new object is created; same obj is referred by p1 and p2.
	//both p1 and p2 has same address
	//if p1 is modified then p2 is impacted.
	//if p2 is modified then p1 is impacted.
		
		System.out.println("showing P1");
		show(p1);
		System.out.println("showing P2");
		show(p2);
		
		
		//change only p2's data
		p2.id = 1001;
		p2.name = "user2";
		p2.age = 31;
		

		System.out.println("showing P1");
		show(p1);
		System.out.println("showing P2");
		show(p2);
		

	}
	
	public static void show(Person pObj){
		System.out.println(pObj.id);
		System.out.println(pObj.name);
		System.out.println(pObj.age);
	}
	
}
