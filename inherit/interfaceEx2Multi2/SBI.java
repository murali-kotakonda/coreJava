package inherit.interfaceEx2Multi2;

public class SBI implements RBIBank, WorldBank{

	public void createAccount() {
		System.out.println("SBI: createAccount");
	}

	public void processLoan() {
		System.out.println("SBI: processLoan");
	}
	 
	 
}
