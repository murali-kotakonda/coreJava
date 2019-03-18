package inherit2AccessParentEx;


public class Employee extends Person{

	private String pan;
	private String pfNo;
	
	public void display(){
		System.out.println(pan);
		System.out.println(pfNo);
		
		System.out.println(getId());
		System.out.println(getAge());
		System.out.println(getName());
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getPfNo() {
		return pfNo;
	}

	public void setPfNo(String pfNo) {
		this.pfNo = pfNo;
	}
	
	
}
