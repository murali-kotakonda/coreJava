package ds.collections.arrayList;

import java.util.ArrayList;
import java.util.List;

public class TestMethods {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();

		names.add("user1"); // add new element
		names.add("user4"); // add new element
		names.add("user5"); // add new element

		names.add(2, "user2"); // adds new element at 2nd position
		// ---> stores as user1,user2,user4,user5

		names.clear(); // deletes all elements

		String data = names.get(1); // search by position . ex: gets the element at 2nd position.

		boolean found = names.contains("user1"); // returns boolean , search by content

		int po = names.indexOf("user1"); // returns the position number for the given data.

		boolean content = names.isEmpty(); // returns boolean to check whether list is empty or not

		names.remove("user2"); // to remove element

		int count = names.size(); // to find size

	}
}