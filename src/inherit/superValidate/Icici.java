package inherit.superValidate;


public class Icici extends RBIBank{

	public void processLoan(){
		super.processLoan();
		System.out.println("Icici: Procesing fees: " +
				"2000/-, Service charge: 1% , doc charge 1000/- " +
				", ");
	}
}
