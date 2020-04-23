package java8Features.stream.adv;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Ex3SortObjs {
public static void main(String[] args) {
	
	List<Employee> employees = new ArrayList<Employee>();
	 
	employees.add(new Employee(1, "Lokesh", 36));
	employees.add(new Employee(2, "Alex", 46));
	employees.add(new Employee(3, "Brian", 52));
	
	//first name comparator
	Comparator<Employee> compareByFirstName = Comparator.comparing( Employee::getName );
	 
	//last name comparator
	Comparator<Employee> compareByLastName = Comparator.comparing( Employee::getAge );
	 
	//Compare by first name and then last name (multiple fields)
	Comparator<Employee> compareByFullName = compareByFirstName.thenComparing(compareByLastName);
	 
	//Using Comparator - pseudo code
	List<Employee> res = employees.stream().sorted( compareByFirstName ).collect(Collectors.toList());
	System.out.println(res);
}
}
