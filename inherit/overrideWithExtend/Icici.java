
package inherit.overrideWithExtend;

public class Icici extends RBI{

	public void processLoan() {
		super.processLoan();
		System.out.println("Charges included are: ");
		System.out.println("documnet charges: 2000");
		System.out.println("service  charge 10000");
	}
}
