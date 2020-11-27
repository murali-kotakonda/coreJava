package input;

import java.util.Scanner;

public class Inpu5 {
	
	public static void main(String[] args) {
		//take two nums as input and perform add, mul , sub and div
		
		//take two nums as input
		Scanner sc = new Scanner(System.in);// sc is point of contact for console
		
		System.out.println("enter num1");
		int n1 = sc.nextInt();
		
		System.out.println("enter num2");
		int n2 = sc.nextInt();
		
		//perform operations
		int sum = n1 + n2;
		int sub = n1 - n2;
		int mul = n1 * n2;
		int div = n1 / n2;
		
		//print results
		System.out.println("sum = "+sum);
		System.out.println("sub = "+sub);
		System.out.println("mul = "+mul);
		System.out.println("div = "+div);
	}
	
	
	
	
	
	
	
	/*
	  1. create  a break point....
	  2. instead of run , select debug the prog
	  3. during the debug , select F6 for prog continution.
	   - variables section shows the variables created during the run time.
	   
	  
	 * */

}
