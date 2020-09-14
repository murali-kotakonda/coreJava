package oops.constructor;

public class Person {
	// instance variables
	int id;
	String name;
	int age;
	
	//instance method
	public void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
	}


	// param arg constructor [3 args]
	public Person(int id, int age, String name) {// local variables
		System.out.println("3 args constructr");
		this.id = id; // local variable value assigning to the instance variable
		this.age = age;
		this.name = name;
	}

	// param arg  constructor [ 2 args]
	public Person(int age, String name) {
		System.out.println("2 args constructr");
		this.age = age;
		this.name = name;
	}

	// zero arg constructor 
	public Person() {
		System.out.println("zero arg constructr");
	}
	
}

//this refer to the current object under execution
//use this keyword , when instance variables names and local variable names are same


