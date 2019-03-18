package oops.constructor;

public class TestConst {
public static void main(String[] args) {
	Person p1 = new Person();
	p1.id=20001;
	p1.name="user1";
	p1.age=29;
	
	Person p3 = new Person(20003,31, "user3");
	Person p4 = new Person(20004,32, "user4");

	Person p2= new Person(30, "user2");
	p2.id=20002;

	
	p1.display();
	p2.display();
	p3.display();
	p4.display();
}
}
