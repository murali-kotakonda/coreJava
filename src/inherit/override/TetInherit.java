package inherit.override;

public class TetInherit {
	public static void main(String[] args) { 
		// CREATE OBJ FOR ICICI
		Icici icici = new Icici();
		icici.createAccount();
		icici.processLoan(); 
		icici.createPPF();
		
		// CREATE OBJ FOR SBI
		
		SBI sbi = new SBI();
		sbi.createAccount();
		sbi.processLoan();
		sbi.processId();
		
		// CREATE OBJ FOR HDFC
		Hdfc hdfc = new Hdfc();
		hdfc.createAccount();
		hdfc.processLoan();
		hdfc.demat();
	}
}

