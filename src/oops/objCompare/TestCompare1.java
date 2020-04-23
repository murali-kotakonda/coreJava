package oops.objCompare;

public class TestCompare1 {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.id = 20001;
		p1.age = 30;
		p1.name = "user1";

		Person p2 = new Person();
		p2.id = 20001;
		p2.age = 30;
		p2.name = "user1";

		if (p1.id == p2.id && p1.name.equals(p2.name) && p1.age==p2.age) {
			System.out.println("objs are equal");
		} else {
			System.out.println("objs not equal");
		}
	}
}
