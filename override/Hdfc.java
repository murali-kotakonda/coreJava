package inherit.override;

public class Hdfc extends RBIBank {
	public void processLoan(){
		
		System.out.println("Hdfc:: rate of intrest 13%");
	}
	
	/*public void createAccount() {
		super.createAccount();
		System.out.println("charging 2000 extra");
	}*/
}
