package encapAbs;

public class TestPerson {
public static void main(String[] args) {
	//create obj
	Person p = new Person();
	
	//set data
	p.setId(12133);
	p.setName("user1");
	p.setAge(34);
	
	
	//read data
	System.out.println(p.getId());
	System.out.println(p.getName());
	System.out.println(p.getAge());
}
}
