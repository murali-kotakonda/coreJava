package basics.loopsEx;

import java.util.Scanner;

public class TestForLoop {

	public static void main(String[] args) {
		//problem();
		//forLoop();
		//whileLoop();
		//doWhileLoop();
		//breakLoop();
		//continueLoop1();
		example();
	}

	private static void example() {
		Scanner sc = new Scanner(System.in);
		int sum =0;
		//take input of count number
		
		
		//for loop to take input and add the sum
		for(int i=1;;i++){
			System.out.println("Enter Number::" + i);
			int num = sc.nextInt();
			if(num<0){
				continue;
			}
			
			sum = sum + num;
			if(sum>=100){
				break;
			}
		}
		
		
		//display the sum
		System.out.println("sum=="+sum);
	
	
	}
	
	private static void continueLoop1() {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		// take input of count number

		// for loop to take input and add the sum
		while (true) {
			System.out.println("Enter Number::");
			int num = sc.nextInt();
			if (num < 0) {
				continue;
			}

			sum = sum + num;
			if (sum >= 50) {
				break;
			}
			System.out.println("curr sum:"+sum);
		}

		// display the sum
		System.out.println("sum==" + sum);

	}

	private static void breakLoop() {
		Scanner sc = new Scanner(System.in);
		int sum =0;
		//take input of count number
		
		
		//for loop to take input and add the sum
		for(int i=1;;i++){
			System.out.println("Enter Number::" + i);
			int num = sc.nextInt();
			sum = sum + num;
			if(sum>=50){
				break;
			}
		}
		
		
		//display the sum
		System.out.println("sum=="+sum);
	
	}

	private static void doWhileLoop() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter count::");
		int count= sc.nextInt();
		
		int sum =0;
		int i =1;
		
		do{
			System.out.println("Enter Number::" + i);
			int num = sc.nextInt();
			sum = sum + num;
			i++;
		}while(i<=count);
		
		//display the sum
		System.out.println("sum=="+sum);
		
	
	}

	private static void whileLoop() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter count::");
		int count= sc.nextInt();
		
		int sum =0;
		//take input of count number
		
		
		//for loop to take input and add the sum
		int i =1;
		
		while(i<=count){
			System.out.println("Enter Number::" + i);
			int num = sc.nextInt();
			sum = sum + num;
			i++;
		}
		
		
		//display the sum
		System.out.println("sum=="+sum);
		
	}

	private static void forLoop() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter count::");
		int count= sc.nextInt();
		
		int sum =0;
		//take input of count number
		
		
		//for loop to take input and add the sum
		for(int i=1;i<=count;i++){
			System.out.println("Enter Number::" + i);
			int num = sc.nextInt();
			
			sum = sum + num;
		}
		
		
		//display the sum
		System.out.println("sum=="+sum);
	}

	private static void problem() {
		int number1 ;
		int number2;
		int number3;
		int sum;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter numbeer 1");
		number1 = sc.nextInt();
		
		System.out.println("enter numbeer 2");
		number2 = sc.nextInt();
		
		System.out.println("enter numbeer 3");
		number3 = sc.nextInt();
		
		sum = number1 + number2 + number3;
		
		System.out.println("sum=="+sum);
	}
}
