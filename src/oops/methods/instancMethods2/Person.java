package instancMethods2;

public class Person {
	
	// id,name, age are instance variables
	int id;
	String name;
	int age;
	
	public Person(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public void print() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
	}
}