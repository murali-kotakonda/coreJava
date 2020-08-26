package inherit.abstractEx3;

/**
 Icici has to override all 3 methods
 */
public class Icici  extends RBI{
	
	public void createPPF() {
		System.out.println("Icici : createPPF");
	}

	public void createAccount() {
		System.out.println("Icici : createAccount");
	}

	public void getKYC() {
		System.out.println("Icici : getKYC");
	}
}
