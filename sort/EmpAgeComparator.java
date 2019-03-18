package sort;

import java.util.Comparator;

public class EmpAgeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		return (int) (e1.getAge() - e2.getAge());
	}
}
