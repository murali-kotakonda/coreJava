package inherit.multilevel;

public class Employee extends Person {

	String pfNo;
	String pan;

	public void displayEmp() {
		System.out.println(pfNo);
		System.out.println(pan);
	}

	public String getPfNo() {
		return pfNo;
	}

	public void setPfNo(String pfNo) {
		this.pfNo = pfNo;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

}
