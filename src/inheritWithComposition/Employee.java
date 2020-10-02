package inheritWithComposition;


public class Employee extends Person{

	private String pan;
	private String pfNo;
	
	public Employee(String name, int age, int id, Address address, String pan, String pfNo) {
		super(name, age, id, address); // call the parent constr
		this.pan = pan;
		this.pfNo = pfNo;
	}

	public void displayEmp(){
		System.out.println(pan);
		System.out.println(pfNo);
	}
	
	public Employee(String name, int age, int id, Address address) {
		super(name, age, id, address);
	}

	public Employee() {
	}

	public String getPan() {
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
