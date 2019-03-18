package inherit2Encap;

public class TetInherit {
	public static void main(String[] args) {
		//create obj
		Employee e1 = new Employee();
		e1.setName("testUser1");
		e1.setId(1234);
		e1.setAge(34);
		e1.setPan("pan_1234");
		e1.setPfNo("pf_testttt");
		
		Employee e2 = new Employee();
		//set data for inherited props
		e2.setName("testUser2");
		e2.setName("testUser1");
		e2.setId(123);
		e2.setAge(35);
		e2.setPan("pan_12345");
		e2.setPfNo("pf_test4544");
		
		
		System.out.println(e1.getName());
		System.out.println(e2.getName());
		e1.displayPerson();
		e1.displayEmp();
	}
}

