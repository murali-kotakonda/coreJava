package basics;

import java.util.Scanner;

public class Ex6 {

/**
 take two numbers as input
 perform add, mul, sub , div for two numbers.
 
 */
public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter num1: ");
	int a = sc.nextInt();
	
	System.out.println("Enter num2: ");
	int b = sc.nextInt();
	
	
	int sum = a + b;
	int sub = a - b;
	
	int mul = a * b;
	int div = a / b;
	int rem = a % b;
	
	
	System.out.println("addition result = " + sum);
	System.out.println("sub result = " +sub);
	System.out.println("mul result = " +mul);
	System.out.println("div result = " +div);
	System.out.println("rem result = " +rem);
	
}
}
