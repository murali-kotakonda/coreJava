package sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortStringList {
	public static void main(String[] args) {
	    List<String> names = Arrays.asList("Cow", "Zebra","Bat", "Apple","Elephant","Mango");

	    System.out.println("before sorting");
		System.out.println(names);

		System.out.println("********************ASC ORDER***********************");
		Collections.sort(names);

		System.out.println("after sorting in ASC");
		System.out.println(names);
		
		System.out.println("********************DESC ORDER***********************");
		Collections.sort(names, Collections.reverseOrder());

		System.out.println("after sorting in DESC");
		System.out.println(names);
	
	}
}
