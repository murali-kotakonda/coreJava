package inherit.single.construtor;

public class TetInherit {
	public static void main(String[] args) {
		// create obj for person
		Person p = new Person("testUser2",50,667676);
		System.out.println("********displaying person info************");
		p.displayPerson();
		
		
		//create obj for employee
		System.out.println("**************displaying employee info***************");
		Employee e = new Employee("shyam", 34, 12000, "testpan", "testpf");
		e.displayPerson();
		e.displayEmp();
	}
}
