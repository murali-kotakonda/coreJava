package inter;

import java.util.Arrays;

//Time complexity: O(n^2)
public class SumOfPairEqualToZero {

	static void minAbsSumPair(int input[]) {
		int len = input.length;
		int minSum = input[0] + input[1];
		String result = "";
		for (int i = 0; i < len - 1; i++) {
			for (int j = i + 1; j < len; j++) {
				int sum = input[i] + input[j];
				if (Math.abs(minSum) > Math.abs(sum)) {
					minSum = sum;
					result = input[i] + " , " + input[j];
				}
			}
		}
		System.out.println(result);
	}

	// Time Complexity: complexity to sort + complexity of finding the optimum pair
	// = O(nlogn) + O(n) = O(nlogn)
	public static void findPairWithMinSum(int input[]) {
		Arrays.sort(input);
		
		int minimumSum = Integer.MAX_VALUE;
		// left and right index variables
		int left = 0, right = input.length - 1;
		String result = "";
		while (left < right) {
			if(left == right)
				break;
			int sum = input[left] + input[right];
			if (Math.abs(sum) < Math.abs(minimumSum)) {
				minimumSum = sum;
				result = input[left] + " , " + input[right];
			}
			if (sum < 0)
				left++;
			else
				right--;
		}

		System.out.println(result);
	}

	public static void main(String[] args) {
		int arr[] = { 1, 60, -10, 70, -80, 85 };
		minAbsSumPair(arr);
		findPairWithMinSum(arr);
	}
}
