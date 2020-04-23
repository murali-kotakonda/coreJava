package inherit.single.construtor;

public class Employee extends Person{

	String pan;
	String pfNo;
	
	public Employee(String name, int age, int id, String pan, String pfNo) {
		super(name, age, id);
		this.pan = pan;
		this.pfNo = pfNo;
	}

	public void displayEmp(){
		System.out.println(pan);
		System.out.println(pfNo);
	}
}
