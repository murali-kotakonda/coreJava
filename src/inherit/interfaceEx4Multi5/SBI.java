package inherit.interfaceEx4Multi5;

public class SBI extends MyBank
                 implements WorldBank, RBI {
	public void createAccount() {
		System.out.println("SBI-processIdentification");
	}

	public void processLoan() {
		System.out.println("SBI-processLoan");
	}

	public void demat() {
		System.out.println("SBI-createAccount");
	}
}
