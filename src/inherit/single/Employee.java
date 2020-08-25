package inherit.single;

public class Employee extends Person{ // Person is parent; Employee is child

	String pan;
	String pfNo;
	
	public void displayEmp(){
		System.out.println(pan);
		System.out.println(pfNo);
	}
}


//How many instance variables are in employee class?
//5 ( id, name , age pan , pfNo)

//How many methods are there in employee class?
//2 displayPerson() , displayEmp() 