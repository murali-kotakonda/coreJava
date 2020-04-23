package oops.encap.toString;

public class TestObjCreation {

	public static void main(String[] args) {
		//1.create obj
		Person person = new Person();
		
		//assigning values
		person.id= 123;
		person.name="testuser1";
		person.age = 29;
		
		//print values
		System.out.println(person);
	}
}
