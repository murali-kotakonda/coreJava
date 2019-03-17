package enums;

public enum LoanType {
	HOME("100", "loan for home purpose"), 
	VEHICLE("101", "loan for VEHICLE purpose"), 
	PERSONAL("102", "loan for PERSONAL purpose");
	
	private String code;

	private String desc;

	private LoanType(String code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	public String getCode() {
		return code;
	}

	public String getDesc() {
		return desc;
	}

}
