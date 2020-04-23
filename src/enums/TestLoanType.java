package enums;

public class TestLoanType {
public static void main(String[] args) {
	
	LoanType home = LoanType.HOME;
	System.out.println(home.getCode());
	System.out.println(home.getDesc());
	
	
	for(LoanType loanType : LoanType.values()){
		System.out.println(loanType.name() 
				+ ", " +loanType.getCode()+" ,"
				+loanType.getDesc());
	}
	
}
}
