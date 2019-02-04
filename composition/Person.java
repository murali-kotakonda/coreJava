package composition;

public class Person {

	public String name;
	public int id;
	public Address currAddress;
	// private Address perAddress;

	public Person() {

	}

	public void display() {
		System.out.println(name);
		System.out.println(id);
	}

	public Person(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Address getCurrAddress() {
		return currAddress;
	}

	public void setCurrAddress(Address currAddress) {
		this.currAddress = currAddress;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", currAddress=" + currAddress + "]";
	}

}
