package clone;

import java.util.HashMap;
import java.util.Map;

public class CloningTest {

	public static void main(String[] args) throws CloneNotSupportedException {

		//create emp obj with data
		Employee emp = new Employee();
		emp.setId(1);
		emp.setName("shyam");

		//clone emp obj
		Employee e2 = (Employee) emp.clone();
		
		Employee e3= emp;

		System.out.println("emp and e3 == test: " + (emp == e3));
		// Check whether the emp and clonedEmp attributes are same or different
		System.out.println("emp and e2 == test: " + (emp == e2));
		
		

	}
 
}