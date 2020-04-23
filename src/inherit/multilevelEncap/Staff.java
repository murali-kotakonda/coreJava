package inherit.multilevelEncap;

public class Staff extends Employee {

	private String contractID;
	private String contractPeriod;

	public void displayStaff() {
		System.out.println(contractID);
		System.out.println(contractPeriod);
	}
	
	public String getContractID() {
		return contractID;
	}

	public void setContractID(String contractID) {
		this.contractID = contractID;
	}

	public String getContractPeriod() {
		return contractPeriod;
	}

	public void setContractPeriod(String contractPeriod) {
		this.contractPeriod = contractPeriod;
	}

}
