package encapAndAbstraction;

public class TestPerson2 {

	public static void main(String[] args) {
		// 1.create obj
		Person2 p = new Person2(2000, "kumar", 45, 12443553);
		
		//print data
		//System.out.println(p.id);
		System.out.println(p.getId());
		
		//System.out.println(p.name);
		System.out.println(p.getName());
		
		//System.out.println(p.age);
		System.out.println(p.getAge());
		
		//System.out.println(p.sal);
		System.out.println(p.getSal());
	}
}