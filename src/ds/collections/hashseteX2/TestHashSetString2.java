package ds.collections.hashseteX2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TestHashSetString2 {
	public static void main(String[] args) {

		Set<String> names = new HashSet<String>();
		names.add("java");
		names.add("sap");
		names.add("hana");
		names.add("apple");
		names.add("zebra");
		names.add("sap");
		names.add("veeru");
		names.add("dotnet");
		names.add("hana");
		
		System.out.println("Entered NAMES ARE :");
		//4. display the names
		
		for(String p : names){
			System.out.println(p);
		}
		
		boolean contains = names.contains("user1");
		System.out.println(contains);
		
		
		names.add("user2");
		names.clear();
		names.isEmpty(); //returns boolean
		names.remove("user2");
		names.size();
		names.contains("user2");//returns boolean
	
	}
}
