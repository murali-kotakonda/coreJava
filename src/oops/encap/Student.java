package oops.encap;

// A student has id, name, branch and semister .
//create obj for student
//set the data 
// print data

//make instance variables  private

public class Student {
	private String name;
	private String id;
	private String branch;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
}
