package input;

import java.util.Scanner;

public class Inpu4 {
	
	public static void main(String[] args) {
		//take string as an input from customer and print the value
		//step 1. create scanner obj
		Scanner sc = new Scanner(System.in);// sc is point of contact for console
		System.out.println("enter any string:");
		String name = sc.nextLine();
		
		//step2: print value
		System.out.println("your name is " +name);
		
	}

}
