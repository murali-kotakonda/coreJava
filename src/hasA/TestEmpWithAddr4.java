package hasA;

public class TestEmpWithAddr4 {

	public static void main(String[] args) {
		// create e1 obj with data for id, name, age , sal
		Employee e1 = new Employee(2000,45,"user1",10000.133f);

		// create e2 obj with data for id, name, age , sal
		Employee e2 = new Employee(5000,78,"user6",20000.133f);
		
		// create multiple address obj with data
		Address a1 = new Address("s1", "amar", "ap", "IN", "5678");
		Address a2 = new Address("s2", "knl", "ap", "IN", "5679");
		Address a3 = new Address("s3", "vijag", "ap", "IN", "5680");

		e1.getAddresses().add(a1);
		e1.getAddresses().add(a2);
		e1.getAddresses().add(a3);
		
		// create multiple address obj with data
		Address a4 = new Address("s4", "Ram nagar", "ap", "IN", "5691");
		Address a5 = new Address("s5", "t nagar", "ap", "IN", "5692");

		e2.getAddresses().add(a4);
		e2.getAddresses().add(a5);
		
		System.out.println("************show e1***************");
		e1.show1();
		System.out.println("************show e2***************");
		e2.show1();
	}
}
