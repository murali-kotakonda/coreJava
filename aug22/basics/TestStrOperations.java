package basics;

import java.util.Scanner;

/**
  Explore the methods for string. 
  
 */
public class TestStrOperations {
	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter name");
		String name= sc.nextLine();
		
		//find of a string
		int size = name.length();
		System.out.println("length of str = "+ size);
		
		//check if the string ends with bye
		boolean endsWithBye = name.endsWith("bye"); //returns boolean
		System.out.println("string ends with bye ="+endsWithBye);
		
		//check if the string starts with hi
		boolean startsWithHi = name.startsWith("hi");//returns boolean
		System.out.println("string starts with hi ="+startsWithHi);
				
		//convert to  upper case and lower case
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		
	}
}
