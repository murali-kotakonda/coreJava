package oops.constructor.copy;

public class TestObjCopy {

	public static void main(String[] args) {
		// 1.create obj
		Person p1 = new Person();

		// assigning values
		p1.id = 123;
		p1.name = "testuser1";
		p1.age = 29;

		Person p2 = p1;
		
		p2.id= 130;
		
		System.out.println(p1.id);
		System.out.println(p2.id);

	}
}
