package encapAbs;

public class TestPersonWOencap {
public static void main(String[] args) {
	Person  p = new Person();
	
	p.setId(1000);
	p.setAge(28);
	p.setName("user1");
	
	System.out.println(p.getId());
	System.out.println(p.getAge());
	System.out.println(p.getName());
}
}
