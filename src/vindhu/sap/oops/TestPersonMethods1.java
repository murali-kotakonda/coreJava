package vindhu.sap.oops;

public class TestPersonMethods1 {
	public static void main(String[] args) {

		PersonService service = new PersonService();
		Person p2 = service.preparePerson(67888, 32, "krishna");
		Person p3 = service.preparePerson(67999, 42, "ramkumar");
		
		service.save(p2);
		service.save(p3);
	}
}
