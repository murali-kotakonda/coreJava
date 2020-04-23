package ds.collections.arrays;

import java.util.Scanner;

public class TestStringArrays0Declaration {
	public static void main(String[] args) {
		String[] names = new String[6];

		// insert the elements
		names[0] = "user1";
		names[1] = "kumar";
		names[2] = "ram";
		names[3] = "raj";
		names[4] = "rakul";
		names[5] = "shyam";

		// read elements
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[3]);
		System.out.println(names[4]);
		System.out.println(names[5]);

		// read all for loop
		System.out.println("Print ALL using for loop");
		for (int i = 0; i < 5; i++) {
			System.out.println(names[i]);
		}

		// read all enhances for loop
		System.out.println("Print ALL using enhanced for  loop");
		for (String p : names) {
			System.out.println(p);
		}

	}
}
