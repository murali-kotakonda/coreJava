package oops.poly.poly2;

public class Service {

	public void save(Employee emp) {
		System.out.println("Saving emp data for" + emp);
	}

	public void save(Person per) {
		System.out.println("Saving per data for" + per);
	}

	public void save(String name) {
		System.out.println("Saving name data for" + name);
	}
}
