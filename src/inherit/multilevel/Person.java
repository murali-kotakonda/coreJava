package inherit.multilevel;

/* 
Person has id,name, age
Employee has id,name, age , pan , pf
Staff has id,name, age , pan , pf , contractId , contractPeriod.

solution:
Person is the parent class for Employee.
Employee is the parent class for Staff. 

Staff class will get inheritance from Person and Employee.



Employee class Extends Person class
Staff class Extends Employee class.

   Person
     |
     |
     |
  Employee  
     |
     |
     |
  Staff

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
