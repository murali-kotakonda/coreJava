package vindhu.sap.oops;

public class TestPersonMethods {
	public static void main(String[] args) {

		Person pObj1 = new Person(1243, "user1", 34);
		Person pObj2 = new Person(1244, "user2", 34);
		Person pObj3 = new Person(1245, "user3", 34);

		PersonService service = new PersonService();
		service.save(pObj1);
		service.save(pObj2);
		service.save(pObj3);

	}
}
