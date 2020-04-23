package vindhu.sap.oops;

public class Person {

	public int id;
	public String name;
	public int age;
	
	
	public Person() {
		super();
	}


	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}


	public void display(){
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
	}


	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	
}
