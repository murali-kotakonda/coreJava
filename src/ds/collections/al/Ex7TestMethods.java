package ds.collections.al;

import java.util.ArrayList;
import java.util.List;

public class Ex7TestMethods {
	public static void main(String[] args) {
			// create the list
		ArrayList<String> names = new ArrayList<>();

		//add 3 elements
		names.add("user1"); // add new element
		names.add("user4"); // add new element
		names.add("user5"); // add new element
		names.add("user6"); // add new element
		
		//print using java8
		names.forEach( name -> System.out.println(name));
		
		// adds new element at 3rd position
		System.out.println("******************Add in between*************************");
		names.add(2,"user2");
		names.forEach( name -> System.out.println(name));

		// search by position .  
		System.out.println("******************search by position ************************");
		System.out.println(names.get(0));
		System.out.println(names.get(1));
		
		// search by content  returns boolean ,
		System.out.println("******************search by content ************************");
		System.out.println("contains kumar ?? "+names.contains("kumar"));
		System.out.println("contains user1 ?? "+names.contains("user1"));
		System.out.println("contains user6 ?? "+names.contains("user6"));
		
		// to find size
		System.out.println("Size = "+names.size());
		
		// to remove element
		System.out.println("******************remove element  ************************");
		names.remove("user1");
		names.forEach( name -> System.out.println(name));
		
		//check empty or not
		System.out.println("Empty check = "+ names.isEmpty());
		
		// deletes all elements
		names.clear();
		
		//check empty or not
		System.out.println("Empty check = "+ names.isEmpty());
		System.out.println("Size = "+names.size());
	}
	
	private static void print(List<String> names) {
		//3. display names:
		System.out.println("\n******print all names : start **********");
		for(String n: names) {
			System.out.print(n + " - ");
		}
		System.out.println("\n");
	}
	
	//int po = names.indexOf("user1"); // returns the position number for the given data.
	//boolean content = names.isEmpty(); // returns boolean to check whether list is empty or not
}