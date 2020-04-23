package ds.collections.assign;

import java.util.ArrayList;
import java.util.Scanner;

/*dont take size
enter the name 
do you wish to continue
if yes 
ask for the next name
do you wish to continue?
If no print all the name
*/



public class ArrayListNum {
	public static void main(String[] args) {
		prefer();
	}

	static ArrayList<Integer> nums = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);

	// prefer fulfills the required features for this assignment
	public static void prefer() {
		String input2 = "";
		do {
			System.out.println("enter num ");
			int input = sc.nextInt();
			nums.add(input);
			System.out.println("Do yo wish to continue type yes or no? ");
			input2 = sc.next();
		}while(input2.equalsIgnoreCase("yes"));
		for (int n : nums) {
			System.out.println(n);
		}

	}
}