package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmpListSort {
	public static void main(String[] args) {
		// sorting object array
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(10, "Murali", 25, 10000));
		empList.add(new Employee(50, "Arun", 29, 20000));
		empList.add(new Employee(6, "lakshman", 35, 5000));
		empList.add(new Employee(7, "lalith", 32, 50000));

		 
		 // sorting by id employees array using Comparable interface
		System.out.println("before :");
		show(empList);
		System.out.println("\n\nsorting based on id:------");
		Collections.sort(empList);
		show(empList);
		
		System.out.println("\n\nsorting based on name:------");
		Collections.sort(empList,new EmpNameComparator());
		Comparator<Employee> aComparator = new Comparator<Employee>() {
		        @Override
		        public int compare(Employee e1, Employee e2) {
		            return e1.getAge() - e2.getAge();
		        }
		    };
		Collections.sort(empList,aComparator);
		show(empList);
		
		
		System.out.println("\n\nsorting based on age:------");
		Collections.sort(empList,new EmpAgeComparator());
		show(empList);
		
		
		System.out.println("\n\nsorting based on sal:------");
		Collections.sort(empList,new EmpSalComparator());
		show(empList);

	}

	private static void show(List<Employee> empList) {
		System.out.println("\n");
		for (Employee emp : empList) {
			System.out.println(emp);
		}
	}
}



/*Comparator<Employee> nameCompare = new Comparator<Employee>() {
@Override
public int compare(Employee e1, Employee e2) {
	// TODO Auto-generated method stub
	return e1.getName().compareTo(e2.getName());
}
};


Comparator<Employee> ageCompare = new Comparator<Employee>() {
@Override
public int compare(Employee e1, Employee e2) {
	// TODO Auto-generated method stub
	return e1.getAge()- e2.getAge();
}
};


Comparator<Employee> salCompare = new Comparator<Employee>() {
@Override
public int compare(Employee e1, Employee e2) {
	// TODO Auto-generated method stub
	return (int) (e1.getSalary() - e2.getSalary());
}
};


*/	
