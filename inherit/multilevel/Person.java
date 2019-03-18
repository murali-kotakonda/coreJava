package inherit.multilevel;

public class Person {

	int id;
	String name;
	int age;

	public void displayPerson(){
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

}
