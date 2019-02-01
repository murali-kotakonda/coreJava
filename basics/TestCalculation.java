package basics;

import java.util.Scanner;

public class TestCalculation {
	public static void main(String[] args) {
		//create scanner obj
		Scanner  sc =  new Scanner(System.in);
		
		System.out.println("enter  num1");
		int n1 = sc.nextInt();

		System.out.println("enter  num2");
		int n2 = sc.nextInt();
		
		int sum = n1+n2;
		int sub = n1-n2;
		int mul = n1*n2;
		int div = n1/n2;
		int rem = n1%n2;
		
		
		System.out.println("sum = "+sum);
		System.out.println("sub = "+sub);
		System.out.println("mul = "+mul);
		System.out.println("div = "+div);
		System.out.println("remainder = "+rem);
		
	}
}
