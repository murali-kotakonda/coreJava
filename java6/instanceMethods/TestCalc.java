package instanceMethods;

public class TestCalc {
	public static void main(String[] args) {

		// obj creation
		Calculator c = new Calculator();

		// set data
		c.n1 = 90;
		c.n2 = 20;

		// call instance methods
		c.sum();
		c.sub();
		c.div();
		c.mul();

		// obj creation
		Calculator c1 = new Calculator();

		// set data
		c1.n1 = 100;
		c1.n2 = 20;

		// call instance methods
		c1.sum();
		c1.sub();
		c1.div();
		c1.mul();
	}
}
