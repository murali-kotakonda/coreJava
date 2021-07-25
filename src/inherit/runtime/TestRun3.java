package inherit.runtime;

import java.util.Scanner;


/**
 How to call the child specific method?

 solution:
 perform the down-casting and call the method.
 */
 
	//createAcc() -> is inherited method
	//processLoan() -> overridden method
	//demat()  -> child specific method

public class TestDowncast {
	public static void main(String[] args) {
		RBI  r = new Hdfc(); // Upcasting  ,// create obj for HDFC and refer by RBI
		r.createAcc (); //RBI 
		r.processLoan(); // HDFC
		
		//how to call the child specific method
		//r.demat(); the obj is referred by RBI
		
		
		//solution :
		// typecast to child class : downcasting and call the child method
		//the obj should be referred by HDFC
		
		if( r instanceof Hdfc)  { // check if r is referring to Hdfc
			Hdfc h = (Hdfc) r; //downcasting ,// obj for HDFC is refered by Hdfc
			// h and r are pointing to the same object
			// h is the HDFC variable
			// r is the RBI variable
			
			h.demat();  // HDFC
		}
		
	}
}
