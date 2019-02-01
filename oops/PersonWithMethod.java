package oops;

public class PersonWithMethod {

	int id;
	String name;
	int age;
	String aadhar;
	
	public void show(){
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
		sayHi();
	}
	
	public void sayHi(){
		System.out.println("hi");
	}
	
}
