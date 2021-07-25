package inherit.interfaceEx2Multiple;

/**
  Multiple inheritance:
  - One child class has multiple parent classes.
  -  possible only using interfaces.
  - One class can implements any number of interfaces.
  
  
  RBIBank , WorldBank are two interfaces.
  Icici implements both RBIBank and WorldBank.
  
  
     RBIBank  - [interface ]        
       |								
       | - createAccount()  - abstarct methods
       |                             
       
  



    WorldBank - [interface ]
       |
       | - processLoan()  - abstarct methods
       |
   
   
     - How many methods are mandatory for icici to override?
     2 ( createAccount()  and  processLoan() )
  
 */
public interface RBIBank {
	
	public static final double rateOfIntrest = 12d;
	
	void createAccount() ;
	
}


