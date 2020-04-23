package java8Features.stream.adv;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex5Joining {
	public static void main(String[] args) {
		Stream<String> words = Arrays.asList("A", "B", "C", "D").stream();
		String joinedString = words.collect(Collectors.joining()); // ABCD
		System.out.println(joinedString);

		joinedString = words.collect(Collectors.joining(",")); // A,B,C,D
		System.out.println(joinedString);

		joinedString = words.collect(Collectors.joining(",", "{", "}")); // {A,B,C,D}
		System.out.println(joinedString);
	}
}
