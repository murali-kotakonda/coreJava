package inherit.multilevelEncap;

public class Employee extends Person {

	private String pfNo;
	private String pan;

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
