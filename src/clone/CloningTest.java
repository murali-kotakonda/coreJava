package clone;

public class CloningTest {

	public static void main(String[] args) throws CloneNotSupportedException {

		//create emp obj with data
		Employee e1 = new Employee();
		e1.setId(1);
		e1.setName("shyam");

		//clone emp obj
		Employee e2 = (Employee) e1.clone();
		
		System.out.println("showing e1");
		System.out.println(e1);
		
		System.out.println("showing e2");
		System.out.println(e2);
		
		
		e1.setId(2);
		e1.setName("kumar");
		
		System.out.println("showing e1");
		System.out.println(e1);
		
		System.out.println("showing e2");
		System.out.println(e2);
		
		
		Employee e3= e1;

		System.out.println("emp and e3 == test: " + (e1 == e3));
		// Check whether the emp and clonedEmp attributes are same or different
		System.out.println("emp and e2 == test: " + (e1 == e2));

	}
 
}