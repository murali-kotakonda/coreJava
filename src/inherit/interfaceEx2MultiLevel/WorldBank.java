package inherit.interfaceEx2MultiLevel;

import javax.management.PersistentMBean;

/**
 
 Can one interface extend another Interface
 YES
 
 Can one interface implements another Interface
 NO [implements is possible only for class]

Can one interface extend/implements another class
 NO 

implements  ---> applicable for a class
extends  ----> applicable for class / interface


		WorldBank - [interface]
           |
           |  processLoan()  - abstract
           | 
         RBIBank   - [interface]   extends WorldBank
           |
           |  createAccount  - abstract
           |    
         Icici   - [class] implements RBIBank
           |
           | - has to override all abstarct methods 
           |


 */
public interface WorldBank{
	
	public abstract void processLoan();
}


