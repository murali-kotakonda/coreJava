package oops.poly.poly2;


public class TestPoly2 {
	public static void main(String[] args) {
		Service s = new Service();

		//create emp obj
		Employee e = new Employee("k","user", 129);
		s.save(e);
		
		Person p = new Person(35, "user2", 189);
		s.save(p);
		s.save("user1");
		
		//create variable without ibj
		//System.out.println(emp2.fName);
		
		Employee emp2 = null;
		s.save(emp2);

		Person per = null;
		s.save(per);
		
		String name=null;
		s.save(name);
		
		//s.save(null);
		
		//create per varible without obj
		
		//s.save(per);
		
		//s.save(null); save method with null cannot be called due to ambuiguity
	}
}
