package inherit.interfaceEx2MultiLevel;

public class Hdfc implements RBIBank{

	public void createAccount() {
		System.out.println("HDFC: createAccount");
	}

	public void processLoan() {
		System.out.println("HDFC: processLoan");
	}
}

