package java8Features.stream.adv;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex6ConcatObjs {
	public static void main(String[] args) {
		Stream<Employee> stream1 = getEmployeeListOne().stream();
		Stream<Employee> stream2 = getEmployeeListTwo().stream();

		Stream<Employee> resultingStream = Stream.concat(stream1, stream2)
				.filter(distinctByKey(Employee::getName));

		System.out.println(resultingStream.collect(Collectors.toList()));
	}

	public static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor) {
		Map<Object, Boolean> map = new ConcurrentHashMap<>();
		return t -> map.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
	}

	private static ArrayList<Employee> getEmployeeListOne() {
		ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee(1, "Lokesh", 10));
		list.add(new Employee(5, "Brian", 24));
		list.add(new Employee(7, "Charles", 16));
		list.add(new Employee(6, "David", 19));
		return list;
	}

	private static ArrayList<Employee> getEmployeeListTwo() {
		ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee(2, "Lokesh", 27));
		list.add(new Employee(4, "Brian", 65));
		list.add(new Employee(3, "David", 24));
		return list;
	}
}
