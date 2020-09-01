package ds.collections.al;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
	
public class TestStringEnd {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		
		// input string till 'END' is encountered
		// 3. input the names
		System.out.println("Enter names and type END to stop :");
		while (true) {
			System.out.println("Enter name :");
			String name = sc.next();
			if ("END".equals(name)) {
				break;
			}
			names.add(name);
		}
		
		System.out.println("Entered NAMES ARE :");
		// 4. display the names

		for (String p : names) {
			System.out.println(p);
		}
	}
}