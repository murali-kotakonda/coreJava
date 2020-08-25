package inherit.abstractEx1;

/**
  RBI is the parent abstract class 
      - createAccount()   ---> Non-abstract method
      - processLoan() ---> Non-abstract method
      - createPPF()  --> abstract method
   
  HDFC is the child class for RBI.
  for HDFC overriding the abstract method is mandatory .  
  HDFC has to write createPPF()  method.
  
      
 */
public abstract class RBIBank {
	
	public void createAccount() {
		System.out.println("RBIBank:: created Account");
	}
	
	 
	public void processLoan(){
		System.out.println("RBIBank:: rate of intrest 9%");
	}
	
	public abstract void createPPF() ;
		
}


