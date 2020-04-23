package inherit.interfaceEx4Multi5;

public class Hdfc 
extends MyBank 
implements WorldBank, RBI {

	public void createAccount() {
		System.out.println("Icici-processIdentification");
	}

	public void processLoan() {
		System.out.println("Icici-processLoan");
	}

	public void demat() {
		System.out.println("Icici-createAccount");
	}

}
