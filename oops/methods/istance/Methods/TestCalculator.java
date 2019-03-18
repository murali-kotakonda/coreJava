package oops.methods.istance.Methods;

public class TestCalculator {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.n1=20;
		c1.n2=10;
		
		Calculator c2 = new Calculator();
		c2.n1=200;
		c2.n2=100;
		
		Calculator c3 = new Calculator();
		c3.n1=2000;
		c3.n2=1000;
		
		c1.sum();
		c1.sub();
		c1.div();
		c1.mul();
		
		c2.sum();
		c2.sub();
		c2.div();
		c2.mul();
		
		c3.sum();
		c3.sub();
		c3.div();
		c3.mul();
	}
}
