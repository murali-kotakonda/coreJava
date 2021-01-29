package oops.composition;

public class TestPersonWithOneAddress2 {
	public static void main(String[] args) { 
		//create the person object
		PersonDetails p1 = new PersonDetails("user1", 12121);
		
		//create the address obj
		Address a1 = new Address("tulasi theatre", "560037", "bang", "ka", "in");
		
        //keep address obj inside the person obj
		p1.currAddress = a1;
				
		
		//print data using person obj
        p1.display();
        p1.currAddress.showAddr();// using person obj get the addressobj and using address obj call showAddr() method
	  
	}
}
// p1.currAddress ->	using person obj get the addressobj