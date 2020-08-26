package inherit.interfaceEx1;

public class TetInherit2 {
	public static void main(String[] args) {
		
		RBI r =  new Icici();// create obj for child and refer by RBI
		
		r.createAccount();// icici
		r.createPPF();// icici
		r.getKYC();// icici
	}
}
