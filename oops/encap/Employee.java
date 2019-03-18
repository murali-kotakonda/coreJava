package oops.encap;

public class Employee {
	String fname;
	String lname;
	String gender;
	String empId;
	public Employee(String fname, String lname, String gender, String empId) {
		this.fname = fname;
		this.lname = lname;
		this.gender = gender;
		this.empId = empId;
	}
	public void show() {
		System.out.println(fname);
		System.out.println(lname);
		System.out.println(gender);
		System.out.println(empId);
	}
	
}
