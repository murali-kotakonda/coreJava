package threads2;

import java.util.Scanner;

public class TestWithThreads {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 2 nums");
		int num1 = 50;//sc.nextInt();
		int num2 = 10;//sc.nextInt();
		
	 AddThread t1 = new AddThread(num1, num2);
	 SubThread t2 = new SubThread(num1, num2);
	 MulThread t3 = new MulThread(num1, num2);
	 DivThread t4 = new DivThread(num1, num2);
		
	 
	 t1.start();
	 t2.start();
	 t3.start();
	 t4.start();
	 
	 
	}
}
