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
		a1.showAddr();

	}
}