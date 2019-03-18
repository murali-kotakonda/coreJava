package sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortStringList {
	public static void main(String[] args) {
		String[] strArr = { "java", "dotnet", "sap", "angularjs", "hadoop" };
		List<String> listStr = Arrays.asList(strArr);

		System.out.println("before sorting");
		System.out.println(listStr);

		Collections.sort(listStr);

		System.out.println("after sorting");
		System.out.println(listStr);
	}
}
