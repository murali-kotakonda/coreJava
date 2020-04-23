package oops.overload2;

public class Service {

	public void save(Person p){
		System.out.println("saving person info");
	}
	
	public void save(Employee e){
		System.out.println("saving emp info");
	}
}
