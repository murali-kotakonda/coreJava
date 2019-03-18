package inherit.interfaceEx4Multi5;

public class Icici  extends RBIBank implements WorldBank, Universe {

	public void processIdentification() {
		System.out.println("Icici-processIdentification");
	}

	public void processLoan() {
		System.out.println("Icici-processLoan");
	}

	public void createAccount() {
		System.out.println("Icici-createAccount");
	}

}
