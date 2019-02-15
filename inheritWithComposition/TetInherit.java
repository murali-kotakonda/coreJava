package inheritWithComposition;


public class TetInherit {
	public static void main(String[] args) {
		// create obj
		Employee emp = new Employee();
		// set data for inherited props
		emp.setName("testUser1");
		emp.setAge(45);
		emp.setId(12345);

		emp.setPan("bnadh671a6");
		emp.setPfNo("testPfNo");

		// create addres obj
		Address localAdd = new Address();
		// set data for addres
		localAdd.setCity("bang");
		localAdd.setCountry("IN");
		localAdd.setHno("56");
		localAdd.setPin("560037");
		localAdd.setState("TN");
		localAdd.setStreetName("mg street");

		// set relatn between emp and address
		emp.setAddress( localAdd);

		//display
		emp.displayPerson();
		emp.displayEmp();
		
		//display address using emp obj
		emp.getAddress().displayAddress();

	}
}
