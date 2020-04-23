package oops.composition;

public class TestPersonWithOneAddress {
	public static void main(String[] args) { 
		PersonDetails p1 = new PersonDetails("user1", 12121);
		Address a1 = new Address("tulasi theatre", "560037", "bang", "ka", "in");
		
		
		//set relation
		p1.setCurrAddress(a1);
		p1.getCurrAddress().showAddr();
		p1.display();

		PersonDetails p2 = new PersonDetails("user2", 222222);
		p2.display();
		//p2.getCurrAddress().showAddr();
		
		System.out.println(Boolean.valueOf("true"));
		System.out.println(Boolean.valueOf(""));
		System.out.println(Boolean.valueOf(null));
	}

	public static void printPerson(Person per) { 
		per.display();
		
		Address curAddr = per.getCurrAddress();
		if(curAddr==null){
			System.out.println("address not avaioable");
		}else{
			curAddr.showAddr(); 
		}
	}
}