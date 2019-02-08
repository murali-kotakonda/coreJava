package staticVari;

public class TestStatic {
public static void main(String[] args) {
	Person p1 = new Person(29, "user1");
	Person p2= new Person(30, "user2");
	Person p3 = new Person(31, "user3");
	Person p4 = new Person(32, "user4");
	
	
	p1.display();
	p2.display();
	p3.display();
	p4.display();
	
	
	
	
	
	
	
	
	
	
	//changing the static variable value
	Person.count = 7000;
	
	//accessing static variable
	System.out.println(Person.count);
	
	Person p5 = new Person(36, "user5");
	p5.display();
	
}
}
