package oops.staticMethods;

public class Service {
	// instance variable
	String v1 = "oracle";

	// static variable
	static double v2 = 12.5d;

	// instance method
	public void m1() {
		System.out.println(v1); // access instance variable
		System.out.println(v2); // access static variable
		
		m2(); // access instance method 
		
		m4();// access static method
	}

	// instance method
	public void m2() {
		System.out.println("inside  m2");
	}

	// static method
	public static void m3() {
			//System.out.println(v1); //cannot access instance variable
		System.out.println(v2); // access static variable
		
		//m2(); // cannot access instance method 
		m4();// access static method
	}

	// static method
	public static void m4() {
		System.out.println("in static m4");
	}

}