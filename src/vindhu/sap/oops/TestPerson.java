package vindhu.sap.oops;

public class TestPerson {
public static void main(String[] args) {
	
	//create obj
	Person p = new Person();
	Person p1 = new Person();
	
	int id=20;
	//assign values to obj
	p.id= 1234;
	p.name="user1";
	p.age= 34;
	
	p1.id= 1235;
	p1.name="user2";
	p1.age= 35;
	//print obj
	System.out.println(id);
	System.out.println(p.id);
	System.out.println(p.name);
	System.out.println(p.age);
	
	System.out.println(p1.id);
	System.out.println(p1.name);
	System.out.println(p1.age);
	
}
}
