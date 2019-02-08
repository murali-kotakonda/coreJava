package staticEx;

public class Person {
	// properties or instance variables
	int id;
	String name;
	int age;

	static int count;
	
	public void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
	}

	public Person() {
		System.out.println("default constr called.");
		this.id = count++;
	}

	public Person(int age, String name) {
		this.id = count++;
		this.name = name;
		this.age = age;
	}

	static {
		System.out.println("in a static block");
		count = 7669;
	}
	
	
	public static void incrementCounter(int value){
		count = count +value;
	}
}
