package vindhu.assignments;

public class Student {
	String sem;
	String branch;
	public Person1 details;
	public Student(String sem, String branch) {
		this.sem = sem;
		this.branch = branch;
	}
	public void showStudent() {
		System.out.println(sem);
		System.out.println(branch);
	}
	
}
