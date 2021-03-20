package exceptions;

import java.util.Scanner;

/**
 

 Case#1:(Earlier)
java is creating exception
dev is handling exception

can a developer reate/throw exception?
yes

Case#2:(Now)
dev is creating exception
dev is handling exception


How to create/throw exception?
1.create the exception object
2.throw the exception object

syntax:
//create the exception object
ArithmeticException ex = new ArithmeticException("second num cannot be 0");

//throw the exception object
throw ex;




Req:
---------------
division of two nums:
if the second num is zero then throw the exception

two methods:
main()   -> handle the exception 
  -take 2 nums as input and call getDivisionResult() method with try and catch

getDivisionResult() -> throw the exception
   -we need to throw the exception obj if the second num is zero 
 
 
 */
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
			// dev is creating the exception 
			ArithmeticException ex = new ArithmeticException("second num cannot be 0");
			throw ex;
		}
		return num1 / num2;
	}
}
