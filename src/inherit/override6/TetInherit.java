package inherit.override6;


public class TetInherit {
	public static void main(String[] args) { 
		
		Person p = new Person("testPers1", 45, 131);
		Employee emp = new Employee("testuser1", 28, 12345, "test_pan", "test_pf");
		
		System.out.println("displaying person");
		p.display();
		
		System.out.println("displaying employee");
		emp.display();
		
		
	}
}
