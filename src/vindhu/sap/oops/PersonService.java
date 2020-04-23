package vindhu.sap.oops;

public class PersonService {

	public void save(Person p1) {
		System.out.println("saved person obj :" + p1);
	}

	public Person preparePerson(int id, int age, String name) {
		Person p = new Person(id,name,age);
		return p;
	}

	
	public void changePerson(Person p1) {
		p1.name = "shyam";
		p1.id = 1313;
		p1.age = 28;
	}

}
