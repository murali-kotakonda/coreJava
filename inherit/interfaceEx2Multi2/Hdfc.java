package inherit.interfaceEx2Multi2;

public class Hdfc implements RBIBank, WorldBank{

	public void createAccount() {
		System.out.println("HDFC: createAccount");
	}

	public void processLoan() {
		System.out.println("HDFC: processLoan");
	}
	 
	 
}

