package java8Features.stream.adv;

import static java.util.stream.Stream.concat;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex6Concat {
	public static void main(String[] args) {
		// ex1
		Stream<Integer> firstStream = Stream.of(1, 2, 3);
		Stream<Integer> secondStream = Stream.of(4, 5, 6);
		Stream<Integer> resultingStream = Stream.concat(firstStream, secondStream);
		System.out.println(resultingStream.collect(Collectors.toList()));

		// ex2
		Stream<Integer> first = Stream.of(1, 2);
		Stream<Integer> second = Stream.of(3, 4);
		Stream<Integer> third = Stream.of(5, 6);
		Stream<Integer> fourth = Stream.of(7, 8);
		resultingStream = Stream.concat(first, concat(second, concat(third, fourth)));
		System.out.println(resultingStream.collect(Collectors.toList()));

		// ex3
		firstStream = Stream.of(1, 2, 3, 4, 5, 6);
		secondStream = Stream.of(4, 5, 6, 7, 8, 9);
		resultingStream = Stream.concat(firstStream, secondStream).distinct();
		System.out.println(resultingStream.collect(Collectors.toList()));
	}
}
