package constr;

public class TestPerson {
	public static void main(String[] args) {

		// without constr
		// create obj
		System.out.println("*****************print p1**********************");
		Person p1 = new Person();// zero arg constr called
		// set the data
		p1.id = 1000;
		p1.age = 18;
		p1.name = "kumar";
		p1.display();

		// with constr
		System.out.println("*****************print p2**********************");
		Person p2 = new Person(1001, "shyam", 29); // create obj + set data
		p2.display();

		// with constr
		System.out.println("*****************print p3**********************");
		Person p3 = new Person(1002, "ram"); // create obj + set data
		p3.age=45;
		p3.display();

	}
}
