package oops.methodEx1;

public class TestCalc {
	public static void main(String[] args) {
		Calculator calc = new Calculator();

		int num1= 40;
		int num2= 20;
		
		calc.sum(num1, num2);
		calc.sub(num1, num2);
		calc.mul(num1, num2);
		calc.div(60, num2);
		calc.sayHi();
	}
}
