package inherit.multilevelEx;

public class Staff extends Employee {
	private String contractType;
	private String contractId;

	public void dispStaff(){
		System.out.println(contractId);
		System.out.println(contractType);
	}

	public String getContractType() {
		return contractType;
	}

	public void setContractType(String contractType) {
		this.contractType = contractType;
	}

	public String getContractId() {
		return contractId;
	}

	public void setContractId(String contractId) {
		this.contractId = contractId;
	}

}
