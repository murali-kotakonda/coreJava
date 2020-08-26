package inherit.abstractEx1;


public class TetInherit2 {
	public static void main(String[] args) { 
		
		//RBIBank r1 = new RBIBank();// OBJ CANNOT BE CREATED FOR Abstract class

		RBIBank r = new Hdfc();// create obj for child and refer by parent
		
		r.createAccount();  // RBI
		r.createPPF();      //Hdfc
		r.processLoan();  // RBI
		
	}
}
