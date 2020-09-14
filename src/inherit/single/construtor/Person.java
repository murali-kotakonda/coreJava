package inherit.single.construtor;

/* 
Person has id,name, age
Employee has id,name, age , pan , pf

create the obj , set data and print.

- Person constructor will have 3 arguments.
- Employee constructor will have 5 arguments.
  From employee constructor we need to call the person constructor using the super keyword.
  
*/
public class Person {
	String name;
	int age;
	int id;
	 
	public Person(String name, int age, int id) {
		this.name = name;
		this.age = age;
		this.id = id;
	}

	public void displayPerson() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(age);
	}
}
