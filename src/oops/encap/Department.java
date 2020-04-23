package oops.encap;
//class is buidling block of props and methods.
// class should have related props and methods
// one class for one entity
//methods should operate on properties

public class Department {
	String depName;
	String depId;
	public Department(String depName, String depId) {
		this.depName = depName;
		this.depId = depId;
	}
	public void display() {
		System.out.println(depName);
		System.out.println(depId);
	}
	
}
