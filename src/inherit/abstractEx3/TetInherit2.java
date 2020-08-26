package inherit.abstractEx3;

public class TetInherit2 {
	public static void main(String[] args) {
		RBI r = new Icici(); // CREATE obj for child and refer by parent
		r.createAccount(); //  Icici
		r.createPPF();   //  Icici
		r.getKYC();   //  Icici
	}
}
