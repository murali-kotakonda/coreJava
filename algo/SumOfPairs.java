
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SumOfPairs {
	// Naive method to find a pair in an array with given sum
	public static void findPairHashMap(int[] A, int sum) {
		// create an empty Hash Map
		Map<Integer, Integer> map = new HashMap<>();

		// do for each element
		for (int i = 0; i < A.length; i++) {
			// check if pair (A[i], sum-A[i]) exists

			// if difference is seen before, print the pair
			if (map.containsKey(sum - A[i])) {
				System.out.println("Pair found at index " + map.get(sum - A[i]) + " and " + i);
				return;
			}

			// store index of current element in the map
			map.put(A[i], i);
		}

		// No pair with given sum exists in the array
		System.out.println("Pair not found");
	}

	// Naive method to find a pair in an array with given sum
	public static void findPair(int[] A, int sum) {
		// consider each element except last element
		for (int i = 0; i < A.length - 1; i++) {
			// start from i'th element till last element
			for (int j = i + 1; j < A.length; j++) {
				// if desired sum is found, print it and return
				if (A[i] + A[j] == sum) {
					System.out.println("Pair found at index " + i + " and " + j);
					return;
				}
			}
		}
		// No pair with given sum exists in the array
		System.out.println("Pair not found");
	}
	
	public static void printPairsUsingSet(int[] numbers, int n){
        if(numbers.length < 2){
            return;
        }        
        Set<Integer> set = new HashSet<>(numbers.length);
        for(int value : numbers){
            int target = n - value;
            // if target number is not in set then add
            if(!set.contains(target)){
                set.add(value);
            }else {
                System.out.printf("(%d, %d) %n", value, target);
            }
        }
    }
    
	// Find pair with given sum in the array
	public static void main(String[] args) {
		int[] A = { 8, 7, 2, 5, 3, 1 };
		int target = 10;
		findPairHashMap(A, target);
	}
}