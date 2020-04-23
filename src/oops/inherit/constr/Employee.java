package oops.inherit.constr;

public class Employee extends Person {

	private String pan;
	private String pfNo;

	public Employee(int id, String name, int age, String pan, String pfNo) {
		super(id, name, age);
		this.pan = pan;
		this.pfNo = pfNo;
	}

	public void displayemp() {
		System.out.println(pan);
		System.out.println(pfNo);
	}
}
