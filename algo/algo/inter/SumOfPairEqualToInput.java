package algo.inter;


import java.util.HashSet;
import java.util.Set;

public class SumOfPairEqualToInput {

	//Time Complexity: O(n).
public static void printPairsUsingSet(int[] numbers, int sum){
    Set<Integer> set = new HashSet<>();
    
    for(int value : numbers){
        int target = sum - value;
        // if target number is not in set then add
        if(!set.contains(target)){
            set.add(value);
        }else {
            System.out.printf("(%d, %d) %n", value, target);
        }
    }
}

	public static void findPair(int[] input, int sum) {
		// consider each element except last element
		for (int i = 0; i < input.length - 1; i++) {
			// start from i'th element till last element
			for (int j = i + 1; j < input.length; j++) {
				// if desired sum is found, print it and return
				if (input[i] + input[j] == sum) {
					System.out.println("Pair found at index " + i + " and " + j);
					return;
				}
			}
		}
		// No pair with given sum exists in the array
		System.out.println("Pair not found");
	}

// Find pair with given sum in the array
public static void main(String[] args) {
	int[] A = { 8, 7, 2, 5, 3, 1 };
	int target = 10;
	printPairsUsingSet(A, target);
}
}