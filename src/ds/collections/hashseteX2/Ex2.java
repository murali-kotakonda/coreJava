package setExs;

import java.util.Set;
import java.util.TreeSet;

/**
 Req:
create a set TreeSet
add multiple names to the set
print all names in the set
 */
public class Ex2 {
	public static void main(String[] args) {
		//
		Set<String> names = new  TreeSet<>();//stores in sorting order
		
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