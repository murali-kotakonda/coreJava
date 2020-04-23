package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortStringList {
	public static void main(String[] args) {
	    List<String> strList = new ArrayList<String>();
	    strList.add("Cow");
	    strList.add("Bat");
	    strList.add("Apple");
	    strList.add("Zebra");
	    strList.add("Elephant");
		
	    System.out.println("before sorting");
		System.out.println(strList);

		Collections.sort(strList);

		System.out.println("after sorting");
		System.out.println(strList);
	}
}
