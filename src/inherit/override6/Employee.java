package inherit.override6;


public class Employee extends Person {

	private String pan;
	private String pfNo;

	public Employee(String name, int age, int id, String pan, String pfNo) {
		super(name, age, id);
		this.pan = pan;
		this.pfNo = pfNo;
	}

	public void display() {
		super.display();
		System.out.println(pan);
		System.out.println(pfNo);
	}

	public Employee() {
	}

	public String getPan() {
		super.display();
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getPfNo() {
		return pfNo;
	}

	public void setPfNo(String pfNo) {
		this.pfNo = pfNo;
	}

}
