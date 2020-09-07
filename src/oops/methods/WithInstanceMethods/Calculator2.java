package oops.methods.WithInstanceMethods;

/*
1.create the obj
2.call the methods using the obj and by passing the data as args.
data we need to pass for every method.


Approach#1: Calculator2.java and TestCalculator2.java
Approach#2: Calculator.java and TestCalculator.java


* */

public class Calculator2 {

	public void sum(int n1, int n2) {
		System.out.println("sum = "+( n1+n2));
	}

	public void sub(int n1, int n2) {
		System.out.println("sub = "+( n1- n2));
	}

	public void mul(int n1, int n2) {
		System.out.println("mul = "+ (n1*n2));
	}

	public void div(int n1, int n2) {
		System.out.println("div = "+ ( n1/n2));
	}

}
