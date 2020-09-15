package oops.compositionEncap;

public class Employee {
	// instance variables
	private int id;
	private String name;
	private int age;

	private Address address;

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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void print() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);

		if (address == null) {
			System.out.println("Address is not available");
		} else {
			address.print();
		}
	}

}
