package arrayListEx;

import java.util.Arrays;
import java.util.List; 
/**
- Create a list with data
- display the data using the array.
*/
public class Ex6 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Cow", "Zebra","Bat", "Apple","Elephant","Mango");
		
		System.out.println("***************Print all names**********************");
		// print all elements
		for (String name : names) {
			System.out.println(name);
		}
	}
}
