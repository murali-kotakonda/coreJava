package sort.arrays;

import java.util.Arrays;

public class ArraySort {
	public static void main(String[] args) {
		int[] intArr = { 21, 4, 22, 6, 3, 15 };
		String[] strArr = { "java", "dotnet", "sap", "angularjs", "hadoop" };

		System.out.println("Before sorting");
		System.out.println(Arrays.toString(intArr));
		System.out.println(Arrays.toString(strArr));

		Arrays.sort(intArr);
		Arrays.sort(strArr);

		System.out.println("after sorting");
		System.out.println(Arrays.toString(intArr));
		System.out.println(Arrays.toString(strArr));
	}
}