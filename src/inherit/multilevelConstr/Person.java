package inherit.multilevelConstr;

/* 
Person has id,name, age
Employee has id,name, age , pan , pf
Staff has id,name, age , pan , pf , contractId , contractPeriod.

solution:
Person is the parent class for Employee.
Employee is the parent class for Staff. 


Staff class will get inheritance from Person and Employee.

Person constructor has 3 args.
Employee constructor has 5 args ,  from employee constr call the  Person constr ..
Staff constructor has 7 args , from Employee constr is called from the Staff constr..

create the objs , set data and print.

*/
public class Person {

	int id;
	String name;
	int age;

	public Person(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public void displayPerson(){
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
	}
}
