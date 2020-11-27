package instanceMethods;

public class Person {
	
	// id, name, age are instance variables
	int id;
	String name;
	int age;
	
	// instance method
	// from instance method we can access instance varibales.
	public void show() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
	}
}

