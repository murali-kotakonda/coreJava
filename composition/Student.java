package composition;

public class Student {

	private int id;
	private String name;
	private String branch;
	private String sem;
	public Address address;
	
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
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getSem() {
		return sem;
	}
	public void setSem(String sem) {
		this.sem = sem;
	}
	public Student(int id, String name, String branch, String sem) {
		this.id = id;
		this.name = name;
		this.branch = branch;
		this.sem = sem;
	}
	public Student() {
	}
	
}
