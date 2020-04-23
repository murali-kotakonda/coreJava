package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortIntegerList2 {
	public static void main(String[] args) {
		//sorting list of objects of Wrapper classes
	    List<Integer> nums = new ArrayList<Integer>();
	    nums.add(100);
	    nums.add(20);
	    nums.add(80);
	    nums.add(67);
	    nums.add(34);
		
	    System.out.println("before sorting");
		System.out.println(nums);

		Collections.sort(nums);

		System.out.println("after sorting");
		System.out.println(nums);
	}
}
