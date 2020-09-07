package enums;

public enum LoanType {
   
	//pre defined Objs
	HOME("100", "loan for home purpose"), 
	VEHICLE("101", "loan for VEHICLE purpose"), 
	PERSONAL("102", "loan for PERSONAL purpose");
	
	/*
	
	internal menaing for above
	LoanType HOME = new LoanType("100", "loan for home purpose"), 
	LoanType VEHICLE = new LoanType("101", "loan for VEHICLE purpose"), 
	LoanType PERSONAL= new LoanType("102", "loan for PERSONAL purpose");
	 * */
	
	
	//instance variables
	private String code;
	private String desc;

	//constr
	private LoanType(String code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	//getters
	public String getCode() {
		return code;
	}

	public String getDesc() {
		return desc;
	}
}
