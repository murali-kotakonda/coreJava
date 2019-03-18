package inherit.override2;

public class Icici extends RBIBank{

	public void processLoan(){
		super.processLoan();
		System.out.println("Icici:: added 5000 as service charge.");
	}
}
