package inherit.overrideEx;

public class TestOveride {
public static void main(String[] args) {
	SBI s = new SBI();
	s.createAcc();
	s.processLoan();
	
	Hdfc h = new Hdfc();
	h.createAcc();
	h.processLoan();
	
	
	Icici i = new Icici();
	i.createAcc();
	i.processLoan();
	
}
}
