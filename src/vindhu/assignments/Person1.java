package vindhu.assignments;

public class Person1 {
	private String id;
	private String name;
	private int age;
	private long aadhar;
	private String pan;
	public String getId() {
		return id;
	}
	public void setId(String id) {
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
	public long getAadhar() {
		return aadhar;
	}
	public void setAadhar(long aadhar) {
		this.aadhar = aadhar;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public Person1(String id, String name, int age, long aadhar, String pan) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.aadhar = aadhar;
		this.pan = pan;
	}
	public void showPerson() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
		System.out.println(aadhar);
		System.out.println(pan);
	}
	public Person1(String id, String name, int age) { 
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public void showDetails() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
	}
}
