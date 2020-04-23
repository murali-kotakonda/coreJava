package inherit.single.construtor;

public class TetInherit {
	public static void main(String[] args) {
		// create obj for person
		Person p = new Person("testUser2",50,667676);
		
		//create obj for employee
		Employee emp = new Employee("testUser1",45,12345,"bnadh671a6","testPfNo");
		//set data for inherited props
		
		System.out.println("displaying person info");
		p.displayPerson();
		
		System.out.println("displaying employee info");
		emp.displayPerson();
		emp.displayEmp();
	}
}
