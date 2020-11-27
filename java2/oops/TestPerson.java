package oops;

public class TestPerson {

	public static void main(String[] args) {
		// create obj for Person
		// set the data
		// print the data
		
		//1. create obj
		Person p1 = new Person();
	    // p1 has seperate memory for id,name,age
		
		//2.set the data
		p1.id=1000;
		p1.name="kumar";
		p1.age=23;
		
		//print data
		System.out.println(p1.id);
		System.out.println(p1.name);
		System.out.println(p1.age);
		
		
		Person p2= new Person();
		//p2 has seperate memory for id,name,age
		
		//2.set the data
		p2.id=1001;
		p2.name="shyam";
		p2.age=25;
		
		//print data
		System.out.println(p2.id);
		System.out.println(p2.name);
		System.out.println(p2.age);
		
	}
}
