package oops.constructor;

public class TestConst3 {
public static void main(String[] args) {
	//old approach with zero arg constr
	Person p1 = new Person();// calls zero-arg constr
	p1.id=20001;
	p1.name="user1";
	p1.age=29;
	
	//new approach using 3 arg constr
	Person p3 = new Person(20003,31, "user3");// calls 3-arg constr
	Person p4 = new Person(20004,32, "user4");// calls 3-arg constr

	//new approach using 2 arg constr
	Person p5 = new Person(39, "user5");// calls 2-arg constr
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
