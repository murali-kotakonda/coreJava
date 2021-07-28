package algo.inter;

import java.util.HashSet;
import java.util.Set;

public class MissingNums {
	public static void main(String[] args) { // given input
		int[] input = { 1, 1, 2, 3, 5, 5, 7, 9, 9, 9 };
 
		/*
		 * int size = input[0]; for(int i: input) size =Math.max(size, i);
		 */
		
		//add all entries to set
		int size = 9;
		Set<Integer> set = new HashSet<>();
		for (int i : input) {
			set.add(i);
		}

		
		
		System.out.println("missing numbers in given array");
		for (int i=1;i<=size;i++) {
			if (!set.contains(i)) {
				System.out.println(i);
			}
		}
	}

}
