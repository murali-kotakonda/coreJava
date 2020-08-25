package inherit.override2;

/**
 
 Ex1 : logic from parent due to inheitence.
 Ex2 : logic comes from child because of overriding .
 Ex3 : logic both from parent and child.
 
RBIBank: parent class
 - createAccount()
 - processLoan()     : RATE OF INTREST OF 9%
 
HDFC :child class of RBIBank

ICICI :child class of RBIBank
  - roi 9 % is fine ; But on top of that ICICI would like to charge rs.2000 as service charge.
  -
    roi 9% should come from RBI and additional charge 2000 should come from ICICI
    
        

solution : 
overriding + call parent method from child

"""
 *
 */
public class RBIBank {
	
	public void createAccount() {
		System.out.println("RBIBank:: created Account");
	}
	
	public  void processLoan(){
		System.out.println("RBIBank:: rate of intrest 9%");
	}
}


