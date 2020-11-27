package constr;

public class Person {
	int id;
	String name;
	int age;
	
	public void display(){
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
	}

	//paramter constr
	public Person(int id, String name, int age) {
		System.out.println("3 arg constr is called");
		this.id = id;
		this.name = name;
		this.age = age;
	}

	//paramter constr
	public Person(int id, String name) {
		System.out.println("2 arg constr is called");
		this.id = id;
		this.name = name;
	}
	
	//zero arg constr
	public Person() {
		System.out.println("zero arg constr  called");
	}
	
}
	
	/*
	
	constr:
      1.create obj + set the data to the instance variables can be done in one line
      [ initialize the instance variables along the obj creation ]


      1. constr name = class name
      2. consr doesnt have any return type
      3.we can have any no of constrs [constrs are over loaded ]
      4. when obj is created then the constr is called automatically.
      constr is the implicite call.
	  
	 
	  */
