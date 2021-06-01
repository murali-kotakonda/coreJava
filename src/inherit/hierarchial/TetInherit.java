package inherit.hierarchial;

public class TetInherit {
	public static void main(String[] args) { 
		System.out.println("************Icici operations**************");
		// CREATE OBJ FOR ICICI
		Icici i = new Icici();
		i.createAccount(); //RBIBank
		i.processLoan();//RBIBank
		i.createPPF(); //Icici
		
		System.out.println("************SBI operations**************");
		// CREATE OBJ FOR SBI
		SBI s = new SBI();
		s.createAccount();//RBIBank
		s.processLoan();//RBIBank
		s.createPPF();// SBI
		

		// CREATE OBJ FOR HDFC.
		 System.out.println("************HDFC operations**************");
		Hdfc h = new Hdfc();
		h.createAccount();//RBIBank
		h.processLoan();//RBIBank
		h.createPPF();//Hdfc
		
	
	}
}