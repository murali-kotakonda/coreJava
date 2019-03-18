package inherit.interfaceEx4Multi5;

import inherit.overrideEx.RBI;

public class SBI extends RBI
                 implements WorldBank, Universe {
	public void processIdentification() {
		System.out.println("SBI-processIdentification");
	}

	public void processLoan() {
		System.out.println("SBI-processLoan");
	}

	public void createAccount() {
		System.out.println("SBI-createAccount");
	}
}
