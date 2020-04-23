package inherit.interfaceEx2Multiple;

public class SBI implements RBIBank, WorldBank{

	public void createAccount() {
		System.out.println("SBI: createAccount");
	}

	public void processLoan() {
		System.out.println("SBI: processLoan");
	}
	 
	 
}
