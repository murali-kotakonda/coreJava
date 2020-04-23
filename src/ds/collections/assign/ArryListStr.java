package ds.collections.assign;

import java.util.ArrayList;
import java.util.Scanner;

public class ArryListStr {
	public static void main(String[] args) {
		/*
		 * 
		 * dont take size enter the name do you wish to continue
		 * if yes ask for the next
		 * name do you wish to continue? If no print all the name
		 */
		//ArrayString.name1();
		prefer();

	}

	static Scanner sc = new Scanner(System.in);
	static ArrayList<String> names = new ArrayList<>();
//prefer fulfills the required features for this assignment
	public static void prefer() {
		while(true) {
		System.out.println("enter name ");
		String input = sc.nextLine();
		names.add(input);
		System.out.println("Do yo wish to continue type yes or no? ");
		 String input2 = sc.nextLine();
		if (input2.equalsIgnoreCase("yes")) {
			/*bug printing twice
			System.out.println("enter name");
			input = sc.nextLine();
			names.add(input);*/
			continue;
			}
		else {
			for (String n : names) {
				System.out.println(n);
			}
			break;
		}
		}
}
}
