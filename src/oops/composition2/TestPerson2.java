package composition2;

/**
 steps:
 1.create person obj with data
 2.create address obj with data
 3.keep address obj inside person obj
 4.print person info and address info
 
 */
public class TestPerson2 {
	public static void main(String[] args) {

		//create person obj with data
		Person  p = new Person();
		p.id=8000;
		p.name="kumar";
		p.age=56;
		
		//create address obj with data
		Address a1 = new Address();
		a1.city="hyd";
		a1.country="in";
		a1.hno="121";
		a1.pinCode="1313131";
		a1.state="KA";
		
		
		//keep address obj inside person obj
	    p.addr = a1;
	    
	    System.out.println("**********show person info************");
	    p.showPersonInfo();
	    
	    
	    System.out.println("**********show address info************");
	    p.addr.showAddress();
	}
}
