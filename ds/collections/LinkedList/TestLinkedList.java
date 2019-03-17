package ds.collections.LinkedList;


import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TestLinkedList {
	public static void main(String[] args) {
		LinkedList<String> names = new LinkedList<String>();

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


		//add at position
		names.add(4, "user4");
		
		//add at 1st
		names.add(0, "user1");
		names.addFirst("user1");
		
		//add at last
		names.addLast("user1");
		

		//remove at position 3
		names.remove(2);
		
		//remove by name
		names.remove("user2");
		
		// 4. display the names
		for (String p : names) {
			System.out.println(p);
		}

		//get element by postion
		String name = names.get(4);
		
		
	}
}
