package inherit.abstractEx1;


public class TetInherit3 {
	public static void main(String[] args) { 
		
		RBIBank r = new Icici(); //Create obj for child , refer by parent
		
		r.createAccount();   // RBI
		r.processLoan();    // ICICI
		r.createPPF();     // ICICI
		
	}
}
