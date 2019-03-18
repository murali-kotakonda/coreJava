package inherit.abstractEx3;

public class Hdfc extends RBIBank {

	@Override
	public void createPPF() {
		System.out.println("HDFC: Createppf");

	}

	@Override
	public void createAccount() {
		System.out.println("hdfc: CREATE ACCOUNT");
	}

	@Override
	public void getKYC() {
		System.out.println("HDFC KYC");
	}

}
