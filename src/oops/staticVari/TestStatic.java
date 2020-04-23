package oops.staticVari;

public class TestStatic {
	public static void main(String[] args) {
		// changing the static variable value

		Employee p1 = new Employee(50000, "user1");
		Employee p2 = new Employee(60000, "user2");
		Employee p3 = new Employee(70000, "user3");
		Employee p4 = new Employee(80000, "user4");

		p1.display();
		p2.display();
		p3.display();
		p4.display();

		Employee.count = 7000;
		Employee p5 = new Employee(9000, "user5");
		p5.display();

		Employee.showCount();
	}
}
