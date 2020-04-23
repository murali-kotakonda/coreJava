package inherit.superDisplay;

public class TetInherit {
	public static void main(String[] args) { 
		// CREATE OBJ FOR ICICI
		Icici icici = new Icici();
		icici.createAccount();//logic from parent
		icici.processLoan(); // logic frm child
		
		
		Hdfc h = new Hdfc();
		h.createAccount();
		h.processLoan();
	}
}

