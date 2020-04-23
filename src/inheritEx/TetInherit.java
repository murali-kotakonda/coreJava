package inheritEx;

public class TetInherit {
	public static void main(String[] args) {
		//creating object	
		Employee e = new Employee();
		
		//setting data
		e.setId(1234);
		e.setName("user1");
		e.setAge(29);
		e.setPfNo("12121");
		e.setPan("pan121");
		
		//display data
	/*	System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getAge());
		System.out.println(e.getPfNo());
		System.out.println(e.getPan());
	*/	
		
		e.displayPerson();
		e.displayEmp();
		
	}
}
