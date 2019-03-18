package inherit.runtimepol;

public class TetInherit {
	public static void main(String[] args) { 
		// CREATE OBJ FOR ICICI
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		RBIBank r = new Icici();
		r.createAccount();//logic from parent
		r.processLoan(); // logic frm child
		//r.createPPF(); // gives compilation ; method is specific to icici
		// CREATE OBJ FOR SBI
		
		r = new SBI();
		r.createAccount();//logic from parent
		r.processLoan();//logic from parent
		
		// CREATE OBJ FOR HDFC
		r = new Hdfc();
		r.createAccount();//logic from parent
		r.processLoan();// logic frm child
	}
}

