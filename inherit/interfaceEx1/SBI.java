package inherit.interfaceEx1;

public class SBI implements RBIBank{

	public void createAccount() {
		System.out.println(rateOfIntrest);
		System.out.println("SBI:: createAccount");		
	}

	public void getKYC() {
		System.out.println("SBI:: getKYC");	
		
	}

	public void createPPF() {
		System.out.println("SBI:: createPPF");	
	}
	 
}
