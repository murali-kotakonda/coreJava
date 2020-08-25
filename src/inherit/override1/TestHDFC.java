package inherit.override1;

public class TestHDFC {
	public static void main(String[] args) { 
		// CREATE OBJ FOR ICICI
		Hdfc h = new 	Hdfc();
		h.createAccount();// from RBI
		h.processLoan();   // from hdfc
		h.demat();
	}
}


//when a method is called using the object
//java will check in the same class
//if not then java will check in the parent class