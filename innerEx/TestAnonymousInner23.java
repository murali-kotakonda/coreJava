package innerEx;

abstract class PersonService1 {
	abstract void print();
}

public class TestAnonymousInner23 {
	public static void main(String args[]) {

		PersonService1 myObj = new PersonService1() {
			void print() {
				System.out.println("Hello");
			}
		};
		myObj.print();

		PersonService1 obj2 = new PersonService1() {
			void print() {
				System.out.println("bye");
			}
		};
		obj2.print();
	}
}
