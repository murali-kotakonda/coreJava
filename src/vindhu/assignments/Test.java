package vindhu.assignments;

public class Test {
	public static void main(String[] args) {
		Person1 p=new Person1("1234","person1",22);
		Person1 p1=new Person1("12345","person1",22,12345567,"dsfg1234cds");
		Student s=new Student("sem-1","CSE");
		Employee e=new Employee("123","1234567889");
		s.details=p;
		e.details=p;
		System.out.println("****student details*****");
		s.showStudent();
		p.showDetails();
		System.out.println("*****employee details******");
		e.showEmployee();
		p.showDetails();
	}
}
