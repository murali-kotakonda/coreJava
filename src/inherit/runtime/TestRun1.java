package inherit.runtime;

/*

Upcasting:
  --------------
  create obj for child class and refer by parent class
  RBI r = new Hdfc(); 
  Here RBIis the   parent class
  Hdfc is the child class.

 
  Using upcasting we can call only the inherited method and  overridden method.
  we cannot call the child specific method.

*/
public class TestRunOK0 {
	//createAcc() -> is inherited method
	//processLoan() -> overridden method
	//demat()  -> child specific method
	
	public static void main(String[] args) {
		
		System.out.println("************[Approach1 ]Hdfc operations **************");
		Hdfc h = new Hdfc(); // create obj for child class and refer by child class
		h.createAcc();    //RBI
		h.processLoan(); //Hdfc 
		h.demat();   // Hdfc
		
		
		System.out.println("************[Approach2 ]Hdfc operations **************");
		RBI r = new Hdfc(); // create obj for child class and refer by parent class.[upcasting]
		r.createAcc(); // RBI
		r.processLoan(); // HDFC
		//r.demat(); // this gives compilation; cannot call child specific method
	 
		
	}
}


/*
 3 types of methods:
 createAcc() -> inherited method
 processLoan() -> overridden method
 demat() -> child specific method.
 
 There are two ways of obj creation?
 1.Hdfc h = new Hdfc(); //create obj for hdfc and refer by Hdfc variable
   [ we can call all the three types of methods ]
 2.RBI h = new Hdfc();   //create obj for hdfc and refer by RBI variable
   [ cannot call the child specific methods ]

 3.Hdfc h = new RBI(); // compilation;
// create obj for parent class and refer by child class.- not possible and it gives compilation

 * */










