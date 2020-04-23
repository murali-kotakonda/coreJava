package oops.objCompare;

import oops.methodEx2.Person;

public class TestCompare2 {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.id = 1000;
		p1.name = "user1";
		p1.age = 30;

		Person p2 = new Person();
		p2.id = 1000;
		p2.name = "user1";
		p2.age = 30;

		if (p1 == p2) {
			System.out.println("objs are equal");
		} else {
			System.out.println("objs not equal");
		}

		if (p1.equals(p2)) {
			System.out.println("objs are equal");
		} else {
			System.out.println("objs not equal");
		}

	}
}
