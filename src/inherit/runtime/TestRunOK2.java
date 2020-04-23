package inherit.runtime;

public class TestRunOK2 {
	public static void main(String[] args) {
		RBI r = new Hdfc();
		r.createAcc(); // RBI
		r.processLoan(); // HDFC

		r = new SBI();
		r.createAcc();//RBI
		r.processLoan();//SBI
		
		r = new Icici();
		r.createAcc();//RBI
		r.processLoan();//ICICI
	}
}
