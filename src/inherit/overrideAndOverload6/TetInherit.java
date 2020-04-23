package inherit.overrideAndOverload6;


public class TetInherit {
	public static void main(String[] args) { 
		// CREATE OBJ FOR ICICI
		Icici icici = new Icici();
		icici.createAccount();
		icici.processLoan(); 
		icici.processLoan("1333");
	}
	 
}

