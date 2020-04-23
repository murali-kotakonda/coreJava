package vindhu.sap.oops;

public class TestChangeperson {
public static void main(String[] args) {
	PersonService ps = new PersonService();
	Person p = ps.preparePerson(15455, 45, "user1");
	System.out.println(p.name); // user1
	
	ps.changePerson(p);
	System.out.println(p.name); // user1

}
}
