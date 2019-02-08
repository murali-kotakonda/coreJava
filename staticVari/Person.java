package staticVari;

public class Person {
	int id;
	String name;
	int age;

	static int count=5000;
	static{
		
	}
	//param arg bconstructor
	public Person(int age, String pName){
		this.id = count;
		count++;
		this.age = age;
		this.name = pName;
	}
	 
	public void display(){
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
	}
}
