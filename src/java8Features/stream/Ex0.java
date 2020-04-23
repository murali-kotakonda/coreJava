package java8Features.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Ex0 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 8, 90, 89, 2, 7, 10, 1, 90);

		System.out.println("***************** List ************************");
		System.out.println(numbers);

		System.out.println("***************** SQUARE ************************");
		List<Integer> result = numbers.stream().map(num -> num * num).collect(Collectors.toList());
		System.out.println(result);

		System.out.println("***************** Even ************************");
		result = numbers.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
		System.out.println(result);

		System.out.println("***************** Odd ************************");
		result = numbers.stream().filter(num -> num % 2 != 0).collect(Collectors.toList());
		System.out.println(result);

		System.out.println("***************** Sort ************************");
		result = numbers.stream().sorted().collect(Collectors.toList());
		System.out.println(result);

		System.out.println("***************** Reverse Sort ************************");
		result = numbers.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(result);

		System.out.println("***************** Duplicate ************************");
		result = numbers.stream().distinct().collect(Collectors.toList());
		System.out.println(result);

		System.out.println("***************** Sort & Duplicate ************************");
		result = numbers.stream().sorted().distinct().collect(Collectors.toList());
		System.out.println(result);

		System.out.println("***************** find first ************************");
		Optional<Integer> findFirst = numbers.stream().findFirst();
		System.out.println(findFirst.isPresent() ? findFirst.get() : "not found");

		System.out.println("***************** limit and skip  ************************");
		result = numbers.stream().skip(1).limit(2).collect(Collectors.toList());
		System.out.println(result);

		System.out.println("***************** has match  ************************");
		boolean hasAnyEven = numbers.stream().anyMatch(i -> i % 2 == 0);
		boolean hasAllEven = numbers.stream().allMatch(i -> i % 2 == 0);
		boolean hasNoMatch = numbers.stream().noneMatch(i -> i % 10 == 0);
		boolean allPositive = numbers.stream().allMatch(i -> i > 0);
		
		System.out.println(allPositive);
		System.out.println(hasAllEven);
		System.out.println(hasAnyEven);
		System.out.println(hasNoMatch);

	}
}
