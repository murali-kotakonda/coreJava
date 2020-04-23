package oops.composition;

public class TestPersonWithTwoAddress {

	public static void main(String[] args) { 
		
		//create per obj with data
		Person p1 = new Person("user1", 12121);
		
		//create curr addrr obj with data
		Address currAddr = new Address("tulasi theatre", "560037", "bang", "ka", "in");

		//set relation person obj and curraddr obj
		p1.setCurrAddress(currAddr);

		
		//create permant addr with data
		Address perAddr = new Address("koti", "500012", "hyd", "tn", "in");
	
		//set relatn between per addr and peson obj
		p1.setPerAddress(perAddr);
	
		printPersonDetails(p1);
		
		p1.display();
	    p1.getCurrAddress(). showAddr();
	    p1.getPerAddress(). showAddr();
	    
	}

	public static void printPersonDetails(Person per) { 
		per.display();
		
		Address curAddr = per.getCurrAddress();
		if(curAddr==null){
			System.out.println("current address not available");
		}else{
			System.out.println("***printing curr address***");
			curAddr.showAddr(); 
		}
		
		Address pAddr = per.getPerAddress();
		if(pAddr==null){
			System.out.println("permanent address not available");
		}else{
			System.out.println("***printing permanet address***");
			pAddr.showAddr(); 
		}
		
	}
}
