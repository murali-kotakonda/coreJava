package oops.abstraction;

public class TestPerson {
public static void main(String[] args) {
	Person p = new Person();
	p.setId(1234);
	p.setName("krishna");
	p.setAge(29);
	
	System.out.println(p.getId());
	System.out.println(p.getName());
	System.out.println(p.getAge());
}
}
