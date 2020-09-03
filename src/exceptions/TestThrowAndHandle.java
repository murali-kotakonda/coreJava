package exceptions;

import java.util.Scanner;

/**
Case#2:
dev is creating exception - getDivisionResult() 
dev is handling exception - main()

 */
public class TestThrowAndHandle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no1");
		int num1 = sc.nextInt();

		System.out.println("enter no2");
		int num2 = sc.nextInt();
		try {
			int output = getDivisionResult(num1, num2);
			System.out.println("output = " + output);
		}
		catch(ArithmeticException ex) {
			System.out.println("division cannot be performed . due to "+ex.getMessage());
		}
		System.out.println("*********end***********");
	}

	private static int getDivisionResult(int num1, int num2) {
		if (num2 == 0) {
			// dev is creating the exception 
			ArithmeticException ex = new ArithmeticException("num2 cannot be 0");
			throw ex;
		}
		return num1 / num2;
	}
}
