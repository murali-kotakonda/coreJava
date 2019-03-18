package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmpListDefaultSort {
	
	public static void main(String[] args) {
		// sorting object array
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(10, "Mikey", 25, 10000));
		empList.add(new Employee(50, "Arun", 29, 20000));
		empList.add(new Employee(6, "Lisa", 35, 5000));
		empList.add(new Employee(7, "Pankaj", 32, 50000));

		 
		 // sorting by id employees array using Comparable interface
		System.out.println("before :");
		show(empList);
		System.out.println("\n\nsorting based on id:------");
		Collections.sort(empList);
		show(empList);
		
	}

	private static void show(List<Employee> empList) {
		System.out.println("\n");
		for (Employee emp : empList) {
			System.out.println(emp);
		}
	}
}
