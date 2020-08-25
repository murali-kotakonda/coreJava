package threads.Calculation2;

import java.util.Scanner;

public class TestWithThread {

 	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);

		//take two nums
		System.out.println("Enter 2 nums");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		//create thread obj for add, mul , sub , div
		CalculatorThread t1 = new CalculatorThread("add", num1, num2);
		CalculatorThread t2 = new CalculatorThread("sub", num1, num2);
		CalculatorThread t3 = new CalculatorThread("mul", num1, num2);
		CalculatorThread t4 = new CalculatorThread("div", num1, num2);
		
		//start all the threads
		t1.start();
		t2.start();
		t3.start();
		t4.start();

		System.out.println("end");
	}

}
