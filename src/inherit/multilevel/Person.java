package inherit.multilevel;

/* 
Person has id,name, age
Employee has id,name, age , pan , pf
Staff has id,name, age , pan , pf , contractId , contractPeriod.


Person is the parent class for Employee.
Employee is the parent class for Staff. 


Staff class will get inheritance from Person and Employee.


create the objs , set data and print.

Employee class Extends Person class
Staff class Extends Employee class.


*/
public class Person {

	int id;
	String name;
	int age;

	public void displayPerson(){
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
	}
 
}
