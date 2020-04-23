package java8Features.stream.adv;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Ex4SortObjs {
	public static void main(String[] args) {
		List<Employee> employees = getUnsortedEmployeeList();
		// Compare by first name and then age
		Comparator<Employee> compareByName = Comparator.comparing(Employee::getName).thenComparing(Employee::getAge);
		List<Employee> sortedEmployees = employees.stream().sorted(compareByName).collect(Collectors.toList());
		System.out.println(sortedEmployees);
	}

	private static List<Employee> getUnsortedEmployeeList() {
		List<Employee> employees = new ArrayList<Employee>();

		employees.add(new Employee(1, "Lokesh", 36));
		employees.add(new Employee(2, "Alex", 46));
		employees.add(new Employee(3, "Brian", 52));
		return employees;
	}
}
