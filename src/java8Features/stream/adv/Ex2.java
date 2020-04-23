package java8Features.stream.adv;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;



public class Ex2 {
public static void main(String[] args) {
	List<Employee> employees = new ArrayList<Employee>();
	 
	employees.add(new Employee(1, "Lokesh", 36));
	employees.add(new Employee(2, "Alex", 46));
	employees.add(new Employee(3, "Brian", 52));
	 
	Comparator<Employee> comparator = Comparator.comparing( Employee::getAge );
	 
	// Get Min or Max Object
	Employee minObject = employees.stream().min(comparator).get();
	Employee maxObject = employees.stream().max(comparator).get();
	 
	System.out.println("minObject = " + minObject);
	System.out.println("maxObject = " + maxObject);
}
}
