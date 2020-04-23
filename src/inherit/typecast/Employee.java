package inherit.typecast;

public class Employee extends Person{
	
	String payrollId;
	String projectId;
	
	public String getPayrollId() {
		return payrollId;
	}
	public void setPayrollId(String payrollId) {
		this.payrollId = payrollId;
	}
	public String getProjectId() {
		return projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	@Override
	public String toString() {
		return "Employee [payrollId=" + payrollId + ", projectId=" + projectId
				+ "]";
	}
	
}
