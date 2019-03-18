package oops.encap;

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
