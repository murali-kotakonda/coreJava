package inherit.override22;

public class RBIBank {
	public void createAccount() {
		System.out.println("RBIBank:: created Account");
	}
	
	public  void processLoan(){
		System.out.println("RBIBank:: rate of intrest 9%");
	}
	
	public final void getKYC(){
		System.out.println("RBIBank:: getKYC");
	}
}