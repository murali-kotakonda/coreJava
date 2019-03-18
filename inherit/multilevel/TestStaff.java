package inherit.multilevel;

public class TestStaff {
	public static void main(String[] args) {
		
		Person p=new Person();
		p.setName("person1");
		p.setId(123);
		p.setAge(21);
		p.displayPerson();
		
		Employee e=new Employee();
		e.setName("emplyee1");
		e.setId(23);
		e.setAge(21);
		e.setPan("wrwr223");
		e.setPfNo("33232");
		e.displayPerson();
		e.displayEmp();
		
		Staff sf = new Staff();
		int id = 123;//sc.nextInt()
		sf.setId(id);
		sf.setAge(29);
		sf.setName("user1");
		sf.setPan("bncpu65ad");
		sf.setPfNo("pf@@@");
		sf.setContractID("contct@@@@");
		sf.setContractPeriod("5");
		
		sf.displayPerson();
		sf.displayEmp();
		sf.displayStaff();
	}
}
