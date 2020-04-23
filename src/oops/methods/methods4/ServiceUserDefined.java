package oops.methods.methods4;

public class ServiceUserDefined {
	
	static int count = 6000;
	public Person preparePerson(String name, String pan, int age) {
		Person p = new Person();
		p.age = age;
		p.id = count++;
		p.name = name;
		p.pan = pan;
		return p;
	}
	
	public void display(Person p) {
		if (p == null) {
			System.out.println("Data not available");
		} else {
			System.out.println(p.id);
			System.out.println(p.name);
			System.out.println(p.pan);
			System.out.println(p.age);
		}

	}

	public Person copyPerson(Person oldPerson) {
		Person newPerson = new Person();
		newPerson.age = oldPerson.age;
		newPerson.id =count++;
		newPerson.name = oldPerson.name;
		newPerson.pan = oldPerson.pan;
		return newPerson;
	}

}
