package inherit.abstractEx3;

public class Icici extends RBIBank{

	@Override
	public void createPPF() {
		System.out.println("ICICI: Createppf");

	}

	@Override
	public void createAccount() {
		System.out.println("ICICI: CREATE ACCOUNT");
	}

	@Override
	public void getKYC() {
		System.out.println("ICICI KYC");
	}

}
