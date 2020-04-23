package exceptions;

import java.util.Scanner;

public class TestThrow {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no1");
		int num1 = sc.nextInt();

		System.out.println("enter no2");
		int num2 = sc.nextInt();
		int output = getDivisionResult(num1, num2);
		System.out.println("output = " + output);
	}

	private static int getDivisionResult(int num1, int num2) {
		if (num2 == 0) {
			ArithmeticException ex = new ArithmeticException("num2 cannot be 0");
			throw ex;
		}
		return num1 / num2;
	}
}
