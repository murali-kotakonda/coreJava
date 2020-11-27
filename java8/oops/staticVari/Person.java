package oops.staticVari;

public class Person {
	int id;
	String name;
	int sal;

	static int count=6000;
	
	//param arg bconstructor
	public Person(int sal, String name) {
		this.id = count;
		count = count+1;
		
		this.sal = sal;
		this.name = name;
	}
		
	 
	public void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(sal);
	}
	
	
	
	
	
	
	
	
	public Person(int id, String name, int sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	
	
	
	public static void showCount() {
		System.out.println(count);
	}
}
