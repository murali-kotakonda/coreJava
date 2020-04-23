package inherit.multilevelConstr;

public class TestStaff {
	public static void main(String[] args) {

		Person p = new Person(123,"user1", 23);

		Employee e = new Employee(124,"user2", 24,"testpan1","testpf1");

		Staff sf = new Staff(125,"user3", 25,"testpan2","testpf2","contct111","5");

		System.out.println("*****displaying person info*******");
		p.displayPerson();
		
		
		System.out.println("*****displaying employee info*******");
		e.displayPerson();
		e.displayEmp();
		
		
		System.out.println("*****displaying staff info*******");
		sf.displayPerson();
		sf.displayEmp();
		sf.displayStaff();
	}
}
