package sort;

import java.util.Arrays;

/**
 Sorting arrays:
------------------------

use  Arrays.sort() method to sort any array in ASC order

How to create the array with data in a single line:
---------------------------------------------------
Integer[] intArr = {5,9,1,10,3,10,78,23,4,7};
	 
For asc order:
use Arrays.sort(<array>);

For desc order:
Arrays.sort(<array>,Collections.reverseOrder());

 */
public class ArraysSort1 {
public static void main(String[] args) {
	 //sort primitives array like int array
    Integer[] intArr = {5,9,1,10,3,10,78,23,4,7};
    System.out.println("Before sort:: " +Arrays.toString(intArr));
    Arrays.sort(intArr);
    System.out.println("Before sort:: " +Arrays.toString(intArr));
}
}
