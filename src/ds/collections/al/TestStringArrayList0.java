package ds.collections.al;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestStringArrayList0 {
	public static void main(String[] args) {
		// 2. create string array
		List<String> names = new ArrayList<String>();

		names.add("user1");
		names.add("user2");
		names.add("user9");
		names.add("user3");

		// display names:
		System.out.println("Entered names are::");

		for (String name : names) {
			System.out.println(name);
		}
	}
}
