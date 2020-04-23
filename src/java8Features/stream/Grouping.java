package java8Features.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Grouping {
	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(
				new Person("Shyam", 12),
				new Person("Madhu", 18),
				new Person("Prema", 23),
				new Person("Pamela", 23),
				new Person("David", 12));

		List<Person> filtered = persons.stream().filter(p -> p.name.startsWith("P")).collect(Collectors.toList());
		System.out.println(filtered);

		Map<Integer, List<Person>> personsByAge = persons.stream().collect(Collectors.groupingBy(p -> p.deptId));
		personsByAge.forEach((dept, p) -> System.out.println("deptId : "+ dept +" persons="+ p));
	}
}
