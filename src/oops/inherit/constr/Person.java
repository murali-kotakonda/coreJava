package oops.inherit.constr;

public class Person {
	private int id;
	private String name;
	private int age;

	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public Person() {

	}

	public void displayPer() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
	}
}
