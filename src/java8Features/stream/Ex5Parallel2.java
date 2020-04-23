package java8Features.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Stream API will allow sequential as well as parallel execution.
//best when working with Collections and usually with Big Data, we need to filter out them based on some conditions.
public class Ex5Parallel2 {
	public static void main(String[] args) {

		List<String> arr1 = new ArrayList<String>();
		arr1.add("Geeks");
		arr1.add("For");
		arr1.add("Geeks");
		arr1.parallelStream().forEach(s -> {
			System.out.print(s);
		});

		// ex2
		Arrays.asList("a1", "a2", "b1", "c2", "c1").parallelStream().filter(s -> {
			System.out.format("filter: %s [%s]\n", s, Thread.currentThread().getName());
			return true;
		}).map(s -> {
			System.out.format("map: %s [%s]\n", s, Thread.currentThread().getName());
			return s.toUpperCase();
		}).forEach(s -> System.out.format("forEach: %s [%s]\n", s, Thread.currentThread().getName()));
	}

}
