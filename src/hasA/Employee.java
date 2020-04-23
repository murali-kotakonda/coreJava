package hasA;

import java.util.LinkedList;
import java.util.List;

// emp with one addr
// emp with 3 address
public class Employee {

	private int id;
	private int age;
	private String name;
	private float sal;
	private List<Address> addresses;

	public Employee()
	{}
	
	public Employee(int id, int age, String name, float sal) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.sal = sal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSal() {
		return sal;
	}

	public void setSal(float sal) {
		this.sal = sal;
	}

	public List<Address> getAddresses() {
		if(addresses==null) {
			addresses = new LinkedList<Address>();
		}
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
	
	public void show() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
		System.out.println(sal);
	}
	
	public void show1() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
		System.out.println(sal);
		if (getAddresses() != null && !getAddresses().isEmpty()) {
			int c =1;
			for (Address a : getAddresses()) {
				System.out.println("******** Address : "+(c++)+"***********");
				a.display();
			}

		} else {
			System.out.println("NO ADDRESS AVAILABLE");
		}
	}

}
