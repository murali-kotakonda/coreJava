package exceptions;

import java.util.Scanner;

public class TestException {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the age::");
		String age = sc.next();
		int ageInt = 0;
		ageInt = Integer.parseInt(age);
		System.out.println("after conversion age int :: " + ageInt);
		System.out.println("exit");

	}

	public static void main1(String[] args) {
		int num1 = 20;
		int num2 = 0;

		int x = num1 / num2;
		System.out.println(x);
		System.out.println("Program ends");

	}

	public static void main2(String[] args) {
		int nums[] = new int[5];
		System.out.println(nums[9]);
	}

	
	public static void main4(String[] args) {
		String name = null;
		int len =name.length();
		System.out.println("length = "+len);
	}

	public static void main3(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = "";
		int num1 = 20;
		int num2 = 1;
		int nums[] = new int[5];

		// possibility of exception due to divide by zero
		int x = num1 / num2;
		System.out.println(x);

		// java.lang.NullPointerException occurs if obj is not created
		System.out.println(name.length());

		// error due to invalid index array index out of bound
		System.out.println(nums[9]);
	}

}
