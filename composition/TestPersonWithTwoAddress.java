package composition;

public class TestPersonWithTwoAddress {

	public static void main(String[] args) {
		// create person obj
		Person p1 = new Person("user1", 12121);

		//create address obj
		Address a1 = new Address("tulasi theatre", "560037", "bang", "ka", "in");

		//
		Address a2 = new Address("ameet pet", "500012", "hyd", "TN", "in");

		// set relation
		p1.currAddress = a1;
		p1.perAddress = a2;
		

		p1.display();
		p1.currAddress.showAddr();
		p1.perAddress.showAddr();

	}
	}