package java8Features.stream;

import java.util.Arrays;
import java.util.List;

public class Ex0Match {
	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(2, 4, 5, 6, 8);

		boolean hasAllEven = intList.stream().allMatch(i -> i % 2 == 0);
		boolean hasAnyEven = intList.stream().anyMatch(i -> i % 2 == 0);
		boolean hasNoMatch = intList.stream().noneMatch(i -> i % 10 == 0);

		System.out.println(hasAllEven);
		System.out.println(hasAnyEven);
		System.out.println(hasNoMatch);

	}
}
