package inheritWithComposition;
/*

has-a and is-a relationship

Person has id, name, age , hno , city , state, country , pin
Employee has id, name, age , pan, pf ,hno , city , state, country , pin


  
 create obj set the data for  person and employee
  
solution:
create 
1.Address class : hno , city , state, country , pin

2.Person class   : declare [ id, name, age , addressObj ] as instance variables
Person class and Address class has HAS-A RELATION

3.Create Employee class that extends Person:
    Employee class : declare only[ pan, pf] as instance variables.
Employee class and Person class has IS-A relation.

- what is inherited to Employee class?
 id, name, age , addressObj

- What is the relation between Employeee and Address?
  HAS-A
  
  
  IS-A : one class is the parent of other
  		Ex: Person class is the parent for employee
  HAS-A : when object of one class is the instance variable for another class.
  		EX: ADDRESS obj is the instance variable for Person
 * */


public class Person {
	private String name;
	private int age;
	private int id;
	private Address address;
	
	public Person(String name, int age, int id, Address address) {
		this.name = name;
		this.age = age;
		this.id = id;
		this.address = address;
	}

	public void displayPerson() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(age);
	}
	
	
	
	
	
	
	
	

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Person() {
		super();
	}

}
