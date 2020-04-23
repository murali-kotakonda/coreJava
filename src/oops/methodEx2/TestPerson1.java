package oops.methodEx2;

public class TestPerson1 {
	public static void main(String[] args) {
		// create obj
		Person p1 = new Person();
		p1.id = 1000;
		p1.name = "user1";
		p1.age = 30;

		Person p2 = new Person();
		p2.id = 1001;
		p2.name = "user2";
		p2.age = 31;

		Person p3 = new Person();
		p3.id = 1002;
		p3.name = "user3";
		p3.age = 32;

		System.out.println(p1.id);
		System.out.println(p1.name);
		System.out.println(p1.age);

		System.out.println(p2.id);
		System.out.println(p2.name);
		System.out.println(p2.age);

		System.out.println(p3.id);
		System.out.println(p3.name);
		System.out.println(p3.age);
	}
}
