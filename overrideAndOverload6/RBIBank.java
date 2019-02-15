package inherit.overrideAndOverload6;


public class RBIBank {
	
	public void createAccount() {
		System.out.println("RBIBank:: created Account");
	}
	
	public void processLoan(){
		System.out.println("RBIBank:: rate of intrest 9%");
	}
	
	public void processLoan(String custId){
		System.out.println("RBIBank:: rate of intrest 8% " +
				"for custId:"+custId);
	}
}


