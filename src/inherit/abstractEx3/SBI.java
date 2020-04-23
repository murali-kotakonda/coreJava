package inherit.abstractEx3;

public class SBI extends RBIBank{

	@Override
	public void createPPF() {
		System.out.println("SBI: Createppf");

	}

	@Override
	public void createAccount() {
		System.out.println("SBI: CREATE ACCOUNT");
	}

	@Override
	public void getKYC() {
		System.out.println("SBI KYC");
	}

 

}
