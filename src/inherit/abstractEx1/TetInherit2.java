package inherit.abstractEx1;


public class TetInherit2 {
	public static void main(String[] args) { 
		
		//RBI r1 = new RBI();// OBJ CANNOT BE CREATED FOR Abstract class

		RBI r = new Hdfc();// create obj for child and refer by parent
		
		r.createAccount();  // RBI
		r.createPPF();   //Hdfc     
		r.processLoan();   //RBI
		
	}
}
