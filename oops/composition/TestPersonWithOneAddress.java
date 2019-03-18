package oops.composition;

public class TestPersonWithOneAddress {

	public static void main(String[] args) { 
		
		Person p1 = new Person("user1", 12121);
		
		Address a1 = new Address("tulasi theatre", "560037", "bang", "ka", "in");

		//set relation
		p1.setCurrAddress(a1);
		
		/*
		p1.display();
		
		p1.getCurrAddress().showAddress();
		*/
		Person p2 = new Person("user2", 222222); 
		printPerson(p1);
		printPerson(p2);
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
