package inherit.abstractEx1;

public class Icici extends RBI{

	public void createPPF() {
		System.out.println("Icici : created ppf");
	}
	
	public void processLoan() {
		System.out.println("Icici:: rate of intrest 12%");
	}
}
// overriding createPPF() is mandatory
// overriding processLoan() is optional.