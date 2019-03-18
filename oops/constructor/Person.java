package oops.constructor;

public class Person {
	 int id;
	 String name;
	 int age;

	//zero arg constructor
	public Person(){
		System.out.println("zero arg constructr");
	}
	
	//param arg bconstructor
	public Person(int id, int age, String pName){
		this.id = id;
		this.age = age;
		name = pName;
	}
	
	public Person(int age, String name){
		this.age = age;
		this.name = name;
	}
	
	public void display(){
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
	}
}
