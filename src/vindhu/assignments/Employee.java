package vindhu.assignments;

public class Employee {
	String projectId;
	String pfNo;
	public Person1 details;
	public Employee(String projectId, String pfNo) {
		this.projectId = projectId;
		this.pfNo = pfNo;
	}
	public void showEmployee() {
		System.out.println(projectId);
		System.out.println(pfNo);
	}
	
}
