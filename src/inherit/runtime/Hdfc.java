package inherit.runtime;

/**
  RBI is parent class
  HDFC is child of RBI
  HDFC is overriding the processLoan() method
  
 */
public class Hdfc extends RBI{

	//overriding method
	public void processLoan() {
		System.out.println("HDFC: 12%");
	}
	
	public void demat() {
		System.out.println("HDFC: demat 13%");
	}
}
