package ds.collections.arrays;

import java.util.Scanner;

/**
  - Take size as input
  - Take input for size number of times and store every data inside the array
  - display the data using the array.
  
 */
public class TestIntWithInput {
	public static void main(String[] args) {
		// 1. input size
		System.out.println("Enter the size");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		// 2. declare the array with size
		int[] nums = new int[size];
		
		// 3. input the numbers
		for(int i=0;i<size;i++) {
			System.out.println("enter number : " + (i+1));
			int n = sc.nextInt();
			//store every data inside the array
			nums[i] = n;
		}

		// display integers
		System.out.println("**********print all elements****************");
		for(int n : nums) {//n contains every element of array for every run
			System.out.println(n);
		}
	}
}


/*
 output:
 --------------
 Enter the size
5
enter number : 1
23
enter number : 2
35
enter number : 3
67
enter number : 4
98
enter number : 5
56
**********print all elements****************
23
35
67
98
56
 * */
