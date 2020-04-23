package ds.collections.al;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestIntegerArrayList {
	public static void main(String[] args) {
		// 2. create string array
		List<Integer> names = new ArrayList<Integer>();

		names.add(1);
		names.add(2);
		names.add(4);
		names.add(5);

		// display names:
		System.out.println("Entered nanumsmes are::");

		for (int name : names) {
			System.out.println(name);
		}
	}
}
