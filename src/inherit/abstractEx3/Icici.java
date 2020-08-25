package inherit.abstractEx3;

/**
 Icici has to override all 3 methods
 */
public class Icici extends RBI{

	@Override
	public void createPPF() {
		System.out.println("Icici : createPPF");
	}

	@Override
	public void createAccount() {
		System.out.println("Icici : createAccount");
	}

	@Override
	public void getKYC() {
		System.out.println("Icici : getKYC");
	}
}
