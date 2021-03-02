package setExs;

import java.util.HashSet;
import java.util.Set;

/**
 Req:
create a set [HashSet/TreeSet/LinkedHashSet]
add multiple names to the set
print all names in the set
 */
public class Ex1 {
	public static void main(String[] args) {
		//
		Set<String> names = new  HashSet<>();//stores in random order
		
		//add new Elements
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
		
		System.out.println("Entered NAMES ARE :");
		for (String s: names) {
			System.out.println(s);
		}
		
	}
	
}