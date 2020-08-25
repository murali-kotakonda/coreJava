package inherit.hierarchial;
/*
  One parent with multiple child classes.
  
   RBIBank: Parent class
     - createAccount()
     - processLoan()
     
   HDFC, ICICI, SBI are the child classes OF RBIBank class.
   
   create obj for hdfc , sbi , icici and call the methods.
   
   
 * */


public class RBIBank {
	
	public void createAccount() {
		System.out.println("RBIBank:: created Account");
	}
	
	public  void processLoan(){
		System.out.println("RBIBank:: rate of intrest 9%");
	}
	 
}


