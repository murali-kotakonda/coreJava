package ds.collections.hashseteX2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 Req:
create a set [HashSet/TreeSet/LinkedHashSet]
add multiple names to the set
print all names in the set

 */
public class TestStrings {
	public static void main(String[] args) {

		//create  HashSet for strings
		Set<String> names = new  HashSet<>();
		//Set<String> names = new  TreeSet<>();
		//Set<String> names = new  LinkedHashSet<String>();
		
		//add text in  HashSet
		names.add("java");
		names.add("sap");
		names.add("hana");
		names.add("hana");
		names.add("apple");
		names.add("java");
		names.add("zebra");
		names.add("sap");
		names.add("veeru");
		names.add("dotnet");
		names.add("hana");
		names.add("java");
		names.add("sap");
		
		
		//print all
		System.out.println("Entered NAMES ARE :");
		for (String s: names) {
			System.out.println(s);
		}
	
	}
}
