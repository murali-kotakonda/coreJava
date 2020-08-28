package inherit.interfaceEx1;


/**
RBI is a interface and has 3 abstract methods
  - createAccount() 
  - getKYC()
  - createPPF()
 
Icici is a child class for RBI. 
   
 */



public interface RBI {
	
	public static final double rateOfIntrest = 12d;
	
	public abstract void createAccount() ;
	
	public abstract void getKYC();

	public abstract void createPPF();
	
}









