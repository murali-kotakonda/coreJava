package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmpListDefaultSort {
	
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(10, "manju", 25, 10000));
		empList.add(new Employee(50, "arun", 29, 20000));
		empList.add(new Employee(6, "laxman", 35, 5000));
		empList.add(new Employee(7, "shyam", 32, 50000));

		 
		System.out.println("before :");
		show(empList);
		
		Collections.sort(empList);
		
		System.out.println("\n\nsorting based on id:------");
		show(empList);
	}

	private static void show(List<Employee> empList) {
		System.out.println("\n");
		for (Employee emp : empList) {
			System.out.println(emp);
		}
	}
}
