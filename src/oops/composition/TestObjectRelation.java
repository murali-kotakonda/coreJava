package oops.composition;

public class TestObjectRelation {

	public static void main(String[] args) {
		// ex1();
		ex3();
	}

	private static void ex1() {
		Person p1 = new Person("user1", 12121);

		Address a1 = new Address("tulasi theatre", "560037", "bang", "ka", "in");

		// set relation
		p1.setCurrAddress(a1);

		p1.display();
		a1.showAddr();
	}

	private static void ex2() {
		Person p1 = new Person("user1", 12121);

		Address a1 = new Address("tulasi theatre", "560037", "bang", "ka", "in");

		// set relation
		p1.setCurrAddress(a1);

		show(p1);
	}

	private static void ex3() {
		// person1
		Person p1 = new Person("user1", 12121);
		Address a1 = new Address("tulasi theatre", "560037", "bang", "ka", "in");
		p1.setCurrAddress(a1);

		// person2
		Person p2 = new Person("user2", 99999);
		Address a2 = new Address("shad nagar", "518003", "hyd", "TN", "in");
		p2.setCurrAddress(a2);

		show(p1);
		show(p2);
	}

	private static void show(Person p1) {
		p1.display();

		Address add = p1.getCurrAddress();
		add.showAddr();

	}

}
