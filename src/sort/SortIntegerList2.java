package sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 Sorting collections:
------------------------

use  Collections.sort() method to sort any collection in ASC order
use  Collections.sort() method with Collections.reverseOrder()  to sort any collection in DESC order
 


how to create arraylist with data in a singleline?
-----------------------------------------------------------
List<Integer> nums = Arrays.asList(10,34,913,34,2,24,365,121,5,2,4,65);
      
      
 */
public class SortIntegerList2 {
	public static void main(String[] args) {
		//sorting list of objects of Wrapper classes
	    List<Integer> nums = Arrays.asList(10,34,913,34,2,24,365,121,5,2,4,65);
		
	    System.out.println("before sorting");
		System.out.println(nums);

		System.out.println("********************ASC ORDER***********************");
		Collections.sort(nums);

		System.out.println("after sorting in ASC");
		System.out.println(nums);
		
		System.out.println("********************DESC ORDER***********************");
		Collections.sort(nums, Collections.reverseOrder());

		System.out.println("after sorting in DESC");
		System.out.println(nums);

	}
}
