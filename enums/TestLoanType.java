package enums;

public class TestLoanType {
public static void main(String[] args) {
	
	for(LoanType loanType : LoanType.values()){
		System.out.println(loanType.name() 
				+ ", " +loanType.getCode()+" ,"
				+loanType.getDesc());
	}
	
	LoanType home = LoanType.HOME;
	System.out.println(home.getCode());
	
	System.out.println(home.getDesc());
	
}
}
