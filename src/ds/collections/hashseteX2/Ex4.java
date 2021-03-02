package setExs;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
- Take input for multiple names and and store every name inside the set
- If the input is "STOP" then stop taking anymore input.
- display the data using the array.

*/
public class Ex4 {
	public static void main(String[] args) {
		// 1. input size
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter names and type STOP to stop :");	
		
		// create the list
		Set<String> names = new  HashSet<>();
		
		//add names till size no of times
		while(true) {
			System.out.println("Enter name : ");
			String name = sc.next();
			if("STOP".equalsIgnoreCase(name)) {
				break;
			}
			names.add(name);
		}

		System.out.println("***************Print all names**********************");
		// print all elements
		for (String name : names) {
			System.out.println(name);
		}

	}
}
