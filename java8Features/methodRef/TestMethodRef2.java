package java8Features.methodRef;

interface Service1 {
	void process();
}

// containingObject::instanceMethodName

public class TestMethodRef2 {

	public void saySomething() {
		System.out.println("Hello, this is non-static method.");
	}

	public static void main(String[] args) {
		TestMethodRef2 methodReference = new TestMethodRef2(); // Creating object
		// Referring non-static method using reference
		Service1 sayable = methodReference::saySomething;
		// Calling interface method
		sayable.process();
		// Referring non-static method using anonymous object
		Service1 sayable2 = new TestMethodRef2()::saySomething; // You can use anonymous object also
		// Calling interface method
		sayable2.process();
	}
}
