package ds.collections.arrays;

import java.util.Scanner;

public class TestString2 {
	public static void main(String[] args) {
		String[] names = { "user1",  "kumar",  "ram", "raj","rakul","shyam"}; // create array with data
		
		//find the size of array
		int size = names.length;
		System.out.println("array size = " + size);

		// read all enhances for loop
		System.out.println("Print ALL using enhanced for  loop");
		for (String p : names) {
			System.out.println(p);
		}

	}
}



//read all for loop
/*
 * System.out.println("Print ALL using for loop"); for (int i = 0; i < 5; i++) {
 * System.out.println(names[i]); }
 */