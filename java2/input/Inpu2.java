package input;

import java.util.Scanner;

public class Inpu2 {
//take input from the console
	
	public static void main(String[] args) {
		
		//take input from customer and print the value
		
		//step 1. create scanner obj
		Scanner sc = new Scanner(System.in);// sc is point of contact for console
		
		System.out.println("enter a float:");
		float x = sc.nextFloat();// store input inside the variable x
		System.out.println("your float input is :"+x);
		
		
		System.out.println("enter a long:");
		long y = sc.nextLong();// store input inside the variable y
		System.out.println("your long  input is :"+y);
		
		
		
		System.out.println("enter a double:");
		double z= sc.nextDouble();// store input inside the variable z
		System.out.println("your double  input is :"+z);
		
		
		
	}

}
