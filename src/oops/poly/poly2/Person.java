package oops.poly.poly2;


public class Person {
	int age;
	String name;
	int id;
	
	public Person(int age, String name, int id) {
		super();
		this.age = age;
		this.name = name;
		this.id = id;
	}
	
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", id=" + id + "]";
	}
	
}
