package threads.Calculation1;

import java.util.Scanner;

public class TestWithThreadLambda {

	 public static void main(String[] args) {
		 System.out.println("main starts");
		Scanner sc = new Scanner(System.in);

		//take inputs
		System.out.println("Enter 2 nums");
		int num1 = 100;//sc.nextInt();
		int num2 = 50;//sc.nextInt();

		//create 4 annnymous class + objects
		Runnable r1 = () -> {
			System.out.println("sum = "+ (num1+num2));
		};
		
		Runnable r2 = () -> {
			System.out.println("sub = "+ (num1-num2));
		};
		
		Runnable r3 = () -> {
			System.out.println("mul = "+ (num1*num2));
		};
		
		Runnable r4 = () -> {
			System.out.println("div = "+ (num1/num2));
		};
		
		//create thread objects
		Thread th1 = new Thread(r1,"add thread");
		Thread th2 = new Thread(r2,"sub thread");
		Thread th3 = new Thread(r3,"mul thread");
		Thread th4 = new Thread(r4,"div thread");
		
		//start the threads
		th1.start();
		th2.start();
		th3.start();
		th4.start();
		
		
		System.out.println("main ends");
		
	}
}
