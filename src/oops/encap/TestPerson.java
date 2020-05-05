package oops.encap;

public class TestPerson {

	public static void main(String[] args) {
		// 1.create obj
		Person p = new Person();

		// assigning values
		p.setId(123); // p.id = 123;
		p.setName("user1");// p.name = "user1";
		p.setAge(28); //p.age= 28;
		p.setSal(11212); //p.sal = 11212

		// print values
		System.out.println(p.getId()); // syso(p.id)
		System.out.println(p.getName());//  syso(p.name)
		System.out.println(p.getAge()); // syso(p.age)
		System.out.println(p.getSal()); // syso(p.sal)
	}
}
