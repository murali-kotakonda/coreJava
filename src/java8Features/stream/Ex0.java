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

		System.out.println("***************** create new list with square of every no ************************");
		List<Integer> result = numbers.stream().map(num -> num * num).collect(Collectors.toList());
		System.out.println(result);

		System.out.println("***************** create new list with only even nos  ************************");
		result = numbers.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
		System.out.println(result);

		System.out.println("***************** create new list with only odd nos  ************************");
		result = numbers.stream().filter(num -> num % 2 != 0).collect(Collectors.toList());
		System.out.println(result);

		System.out.println("***************** create new list with ASC order  ************************");
		result = numbers.stream().sorted().collect(Collectors.toList());
		System.out.println(result);

		System.out.println("***************** create new list with DESC order ************************");
		result = numbers.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(result);

		System.out.println("***************** create new list with Removing duplicate ************************");
		result = numbers.stream().distinct().collect(Collectors.toList());
		System.out.println(result);

		System.out.println("***************** create new list with Sort & Removing duplicate  ************************");
		result = numbers.stream().sorted().distinct().collect(Collectors.toList());
		System.out.println(result);

		System.out.println("***************** find first ************************");
		Optional<Integer> findFirst = numbers.stream().findFirst();
		System.out.println(findFirst.isPresent() ? findFirst.get() : "not found");

		System.out.println("***************** limit and skip  ************************");
		result = numbers.stream().skip(1).limit(2).collect(Collectors.toList());
		System.out.println(result);
	}
}
