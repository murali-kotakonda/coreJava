package instanceMethods;

public class Calculator {

	// n1, n2 are instance variables
	int n1;
	int n2;

	// instance method
	public void sum() {
		System.out.println("sum = "+ ( n1 + n2) );
	}

	// instance method
	public void sub() {
		System.out.println("sub = "+ ( n1 - n2 ) );
	}

	// instance method
	public void mul() {
		System.out.println("mul = "+n1 * n2);
	}

	// instance method
	public void div() {
		System.out.println("div = "+n1 / n2);
	}

}
