package staticEx;

public class TestPersonEx {
	public static void main(String[] args) {
		Person p = new Person();
		System.out.println(Person.count);
		Person p1 = new Person();
		
		Person.incrementCounter(10);
		System.out.println(Person.count);
	}
}
