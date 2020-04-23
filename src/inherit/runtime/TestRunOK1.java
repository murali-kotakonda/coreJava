package inherit.runtime;

public class TestRunOK1 {
	public static void main(String[] args) {
		RBI r = new Hdfc();
		r.createAcc(); // RBI
		r.processLoan(); // HDFC
//r.demat(); //WILL NOT WORK

		Hdfc h = (Hdfc) r;
		h.demat();

		SBI s = (SBI) r;// gives RTE

	}
}
