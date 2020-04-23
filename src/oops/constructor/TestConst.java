package oops.constructor;

public class TestConst {
public static void main(String[] args) {
	//old approach
	Person p1 = new Person();
	p1.id=20001;
	p1.name="user1";
	p1.age=29;
	
	//new approach
	Person p3 = new Person(20003,31, "user3");
	Person p4 = new Person(20004,32, "user4");


	Person p5 = new Person(39, "user5");
	p5.id= 20005;
	
	System.out.println("********showing p1 data ****************");
	p1.display();
	
	System.out.println("********showing p3 data ****************");
	p3.display();

	System.out.println("********showing p4 data ****************");
	p4.display();
	
	System.out.println("********showing p5 data ****************");
	p5.display();
}
}
