package ds.collections.al;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
- Take input for multiple names and and store every name inside the arraylist
- If the input is "END" then stop taking anymore input.
- display the data using the arraylist.

solution:
dont use arrays
use any list

*/
public class Ex3TestStringEnd {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		
		// input string till 'STOP' is encountered
		// 3. input the names
		System.out.println("Enter names and type END to stop :");
		
		//take input logic
		while (true) {// infinite loop 
			System.out.println("Enter name :");
			String name = sc.next();
			if ("END".equals(name)) {
				break;  // exit from loop
			}
			names.add(name); // add to the arraylist
		}
		
		System.out.println("Entered NAMES ARE :");
		// 4. display the names
		for (String p : names) {
			System.out.println(p);
		}
	}
}