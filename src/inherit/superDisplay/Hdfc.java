package inherit.superDisplay;

public class Hdfc extends RBIBank {
	public void createPPF(){
		System.out.println("Icici:: createed ppf");
	}
	
	public void processLoan() {
		super.processLoan();
		System.out.println("Icici: Procesing fees: " + "2000/-, Service charge: 1% , doc charge 1000/- " + ", ");
	}
}
