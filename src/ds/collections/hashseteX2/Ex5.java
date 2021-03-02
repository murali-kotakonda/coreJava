package setExs;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
- size as input
- add names till size no of times
- print all names
*/
public class Ex5 {
	public static void main(String[] args) {
		// 1. input size
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size::");
		int size = sc.nextInt();

		
		// create the SET
		Set<String> names = new  HashSet<>();
		
		//add names till size no of times
		for(int  i=0;i<size;i++) {
			System.out.println("Enter name : ");
			String name = sc.next();
			names.add(name);
		}

		System.out.println("***************Print all names**********************");
		// print all elements
		for (String name : names) {
			System.out.println(name);
		}

	}
}
