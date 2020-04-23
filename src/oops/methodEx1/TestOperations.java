package oops.methodEx1;

public class TestOperations {
	public static void main(String[] args) {
		Operations3 calc = new Operations3();

		int num1= 40;
		int num2= 20;
		
		calc.sum(num1, num2);
		calc.sub(num1, num2);
		calc.mul(num1, num2);
		calc.div(60, num2);
		calc.sayHi();
	}
}
