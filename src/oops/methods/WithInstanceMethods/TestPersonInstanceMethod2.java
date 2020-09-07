package oops.methods.WithInstanceMethods;

public class TestPersonInstanceMethod2 {
	public static void main(String[] args) {
		Person p2 = getPersonObj(2009, "user3", 29);
		System.out.println("***********Print p2***************");
		p2.display();

		Person p3 = getPersonObj(2011, "user4", 35);
		System.out.println("***********Print p3***************");
		p3.display();
	}

	public static Person getPersonObj(int id, String name, int age) {
		Person obj = new Person();
		obj.id = id;
		obj.name = name;
		obj.age = age;
		return obj;
	}
}
