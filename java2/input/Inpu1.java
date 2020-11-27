package input;

import java.util.Scanner;

public class Inpu1 {
//take input from the console
	
	public static void main(String[] args) {
		
		//take input from customer and print the value
		
		//step 1. create scanner obj
		Scanner sc = new Scanner(System.in);// sc is point of contact for console
		
		System.out.println("enter number:");
		int x = sc.nextInt();// store input inside the variable x
		System.out.println("your input is :"+x);
		
		
	}

}
