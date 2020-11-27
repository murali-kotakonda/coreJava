package encap;

public class Person {
	// instance variables are private
	private int id;
	private String name;
	private  int age;
	
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

// if the instance varible or method is private , then it cannot be accessed outside the class

//  1. make instance variables as private

//2.expose the methods to set data and read data (setters & getters)

//for every instance variables provide setter and getter 
