package oops.staticVari;

public class TestStatic {
	public static void main(String[] args) {
		// changing the static variable value
		Person p1 = new Person(90000,"user1");
		Person p2 = new Person(60000, "user2");
		Person p3 = new Person(70000, "user3");
		Person p4 = new Person(80000, "user4");

		p1.display();
		p2.display();
		p3.display();
		p4.display();

	}
}
