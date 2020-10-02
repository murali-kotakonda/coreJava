package inheritWithComposition;

public class TetInherit {
	public static void main(String[] args) {

		// create obj with data
		Person p1 = new Person();
		p1.setName("testUser1");
		p1.setAge(45);
		p1.setId(12345);

		// create addres obj with data
		Address a1 = new Address();
		a1.setCity("bang");
		a1.setCountry("IN");
		a1.setHno("56");
		a1.setPin("560037");
		a1.setState("TN");
		a1.setStreetName("mg street");

		
		// set relatn between person obj  and address obj
		p1.setAddress(a1);

		//display
		p1.displayPerson();
		p1.getAddress().displayAddress();
		
		
		// create emp obj with data
		Employee e1 = new Employee();
		e1.setName("testUser1");
		e1.setAge(45);
		e1.setId(12345);

		e1.setPan("bnadh671a6");
		e1.setPfNo("testPfNo");

		
		
		// create addres obj with data
		Address a2 = new Address();
		a2.setCity("bang");
		a2.setCountry("IN");
		a2.setHno("56");
		a2.setPin("560037");
		a2.setState("TN");
		a2.setStreetName("mg street");

		
		// set relatn between emp and address
		e1.setAddress(a2);

		// display
		e1.displayPerson();
		e1.displayEmp();
		e1.getAddress().displayAddress();

	}
}
