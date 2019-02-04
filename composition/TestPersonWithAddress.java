package composition;

public class TestPersonWithAddress {

	public static void main(String[] args) {
		// create person obj
		Person p1 = new Person("user1", 12121);

		//create address obj
		Address a1 = new Address("tulasi theatre", "560037", "bang", "ka", "in");

		// set relation
		p1.currAddress = a1;

		p1.display();
		p1.currAddress.showAddr();
		
		System.out.println(p1.currAddress.city);
		System.out.println(p1.currAddress.country);
		System.out.println(p1.currAddress.hno);
		System.out.println(p1.currAddress.pinCode);
		System.out.println(p1.currAddress.state);
	}
}