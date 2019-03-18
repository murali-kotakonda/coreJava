package sort.arrays;

import java.util.Arrays;

import sort.EmpAgeComparator;
import sort.EmpNameComparator;
import sort.EmpSalComparator;
import sort.Employee;

public class EmpArraySort {
public static void main(String[] args) {
	//sorting object array
	Employee[] empArr = new Employee[4];
	empArr[0] = new Employee(10, "Mikey", 25, 10000);
	empArr[1] = new Employee(20, "Arun", 29, 20000);
	empArr[2] = new Employee(5, "Lisa", 35, 5000);
	empArr[3] = new Employee(1, "Pankaj", 32, 50000);

	//sorting by id employees array using Comparable interface implementation
	System.out.println("before Sorting of Employees list:\n"+Arrays.toString(empArr));
	Arrays.sort(empArr);
	System.out.println("after Sorting of Employees list:\n"+Arrays.toString(empArr));
	 
	
	
	
	
	
	 //sort(empArr); 
}

private static void sort(Employee[] empArr) {
	//sort by sal employees array using Comparator by Salary
	Arrays.sort(empArr, new EmpSalComparator());
	System.out.println("Employees list sorted by Salary:\n"+Arrays.toString(empArr));

	//sort employees by age array using Comparator by Age
	Arrays.sort(empArr, new EmpAgeComparator());
	System.out.println("Employees list sorted by Age:\n"+Arrays.toString(empArr));

	//sort employees array using Comparator by Name
	Arrays.sort(empArr, new EmpNameComparator());
	System.out.println("Employees list sorted by Name:\n"+Arrays.toString(empArr));
}
}
