package ds.collections.al;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
	
/**
 
avoid duplicates:
1. check if the name exists   
	 use names.contains(name) 
2.if name doesnt exist then add the name

if(!names.contains(name)) {
				names.add(name); // add to the arraylist
	}


 */
public class TestStringEndAvoidDuplicates {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		
		// input string till 'END' is encountered
		// 3. input the names
		System.out.println("Enter names and type END to stop :");
		//take input logic
		while (true) {// infinite loop 
			System.out.println("Enter name :");
			String name = sc.next();
			if ("END".equals(name)) {
				break;  // exit from loop
			}
			
			if(!names.contains(name)) {
				names.add(name); // add to the arraylist
			}
		}
		
		System.out.println("Entered NAMES ARE :");
		// 4. display the names
		for (String p : names) {
			System.out.println(p);
		}
	}
}