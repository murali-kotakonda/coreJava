package java8Features.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex0Strings {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Amitabh");
		names.add("Shekhar");
		names.add("Aman");
		names.add("Rahul");
		names.add("Shahrukh");
		names.add("Salman");
		names.add("Yana");
		names.add("Lokesh");

		names.stream().filter((s) -> s.startsWith("S")).forEach(System.out::println);
		names.stream().filter((s) -> s.startsWith("A")).map(String::toUpperCase).forEach(System.out::println);
		names.stream().sorted().map(String::toUpperCase).forEach(System.out::println);

		List<String> memNamesInUppercase = names.stream().sorted().map(String::toUpperCase)
				.collect(Collectors.toList());
		System.out.print(memNamesInUppercase);

		boolean matchedResult = names.stream().anyMatch((s) -> s.startsWith("A"));
		System.out.println(matchedResult);

		matchedResult = names.stream().allMatch((s) -> s.startsWith("A"));
		System.out.println(matchedResult);

		matchedResult = names.stream().noneMatch((s) -> s.startsWith("A"));
		System.out.println(matchedResult);

		long totalMatched = names.stream().filter((s) -> s.startsWith("A")).count();
		System.out.println(totalMatched);

		boolean matched = names.stream().anyMatch((s) -> s.startsWith("A"));
		System.out.println(matched);

		String firstMatchedName = names.stream().filter((s) -> s.startsWith("A")).findFirst().get();
		System.out.println(firstMatchedName);

		//remove blank and null
		List<String>strings = Arrays.asList("abc", "", null,"bc", "efg", "abcd","", "jkl");
		List<String> filtered = strings.stream().filter(string -> string!=null && !string.isEmpty()).collect(Collectors.toList());
		System.out.println(filtered);
	}
}

/*
 1.Create new list with all upper cases
2.create new list with all lowr cases
3.create new list with only the strings that strats with S
4.create new list with ASC ORDER
5.create new list with DESC ORDER
 * */