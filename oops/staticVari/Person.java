package oops.staticVari;

public class Person {
	int id;
	String name;
	int age;

	static int count=5000;
	//param arg bconstructor
	public Person(int age, String pName){
		id = count++;
		this.age = age;
		name = pName;
	}
	 
	public void display(){
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
	}
}
