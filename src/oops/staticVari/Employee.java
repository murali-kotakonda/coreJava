package oops.staticVari;

public class Employee {
	int id;
	String name;
	int sal;

	static int count=6000;
	
	//param arg bconstructor
	public Employee(int sal, String name){
		id = count++;
		this.sal = sal;
		this.name = name;
	}
	 
	public void display(){
		System.out.println(id);
		System.out.println(name);
		System.out.println(sal);
	}
	
	public static void showCount() {
		System.out.println(count);
	}
}
