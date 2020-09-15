package oops.constructor.copy;

public class TestObjCopy2 {

	public static void main(String[] args) {
		// 1.create obj
		Person p1 = new Person();

		// assigning values
		p1.id = 123;
		p1.name = "testuser1";
		p1.age = 29;

		Person p2 = p1;

		p2.id = 130;

		System.out.println(p1.id);
		System.out.println(p2.id);

		p2 = new Person();
		p2.id = 456;
		p2.name = "testuser2";
		p2.age =89;
		
		System.out.println(p1.id);
		System.out.println(p2.id);

	}
}
