package oops.methods.WithInstanceMethods;

public class TestPersonInstanceMaethod {
	public static void main(String[] args) {
		// create obj
		Person p1 = new Person();
		
		//set the data
		p1.id=2010;
		p1.name="user2";
		p1.age=25;
		
		//cal the display function
		p1.display();

		Person p2 = getPersonObj(2009, "user3", 29);
		p2.display();

		Person p3 = getPersonObj(2011, "user4", 35);
		p3.display();
	}

	
	public static Person getPersonObj(int id, String name, int age) {
		Person obj = new Person();
		obj.id = id;
		obj.name = name;
		obj.age = age;

		return obj;
	}
}
