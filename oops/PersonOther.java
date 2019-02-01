package oops;

public class PersonOther {

	public void show(){
		PersonWithMethod p = new PersonWithMethod();
		System.out.println(p.id);
		System.out.println(p.name);
		System.out.println(p.age);
		p.sayHi();
	}
}
