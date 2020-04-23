package inherit.override22;

public class TetInherit {
	public static void main(String[] args) { 
		// CREATE OBJ FOR ICICI
		Icici icici = new Icici();
		icici.createAccount();
		icici.processLoan(); 
		
		// CREATE OBJ FOR SBI
		
		SBI sbi = new SBI();
		sbi.createAccount();
		sbi.processLoan();
		
		// CREATE OBJ FOR HDFC
		Hdfc hdfc = new Hdfc();
		hdfc.createAccount();
		hdfc.processLoan();
	}
}

