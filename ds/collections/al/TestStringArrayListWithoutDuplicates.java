package ds.collections.al;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestStringArrayListWithoutDuplicates {
	public static void main(String[] args) {
		// 1. input size
		Scanner sc = new Scanner(System.in);
		// 2. create string array
		List<String> names = new ArrayList<String>();
		// input name for size number of times
		String inputCh = null;

		do {
			System.out.println("Enter name:");
			String name = sc.next();

			if (!names.contains(name)) {
				names.add(name);
			}

			System.out.println("DO you want to contiue(yes/no??");
			inputCh = sc.next();
		} while (inputCh.equalsIgnoreCase("yes"));

		// display names:
		System.out.println("Entered names are::");

		for (String name : names) {
			System.out.println(name);
		}

	}
}
