package oops.abstraction;

public class TestPerson {
	public static void main(String[] args) {
		Person p = new Person();
		p.setId(1234); // p.id= 1234;
		p.setName("krishna");// p.name="krishna";
		p.setAge(29);//p.age = 29;

		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p.getAge());
	}
}
