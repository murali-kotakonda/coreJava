package oops.poly.poly2;

public class Employee {

	String fName;
	 String lName;
	 int regNo;
	 
	 public Employee(String fName, String lName, int regNo) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.regNo = regNo;
	}
	
	public String toString() {
		return "Employee [fName=" + fName + ", lName=" + lName + ", regNo="
				+ regNo + "]";
	}
	 
	 
}
