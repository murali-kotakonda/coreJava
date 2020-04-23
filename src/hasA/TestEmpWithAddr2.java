package hasA;

import java.util.LinkedList;
import java.util.List;

public class TestEmpWithAddr2 {

	public static void main(String[] args) {
		// create emp obj wity data for id, name, age , sal
		Employee e = new Employee(2000,45,"user1",10000.133f);

		// create multiple address obj with data
		Address a1 = new Address("s1", "amar", "ap", "IN", "5678");
		Address a2 = new Address("s2", "knl", "ap", "IN", "5679");
		Address a3 = new Address("s3", "vijag", "ap", "IN", "5680");

		// create list and add a1, a2, a3
		List<Address> addrs = new LinkedList<>();
		addrs.add(a1);
		addrs.add(a2);
		addrs.add(a3);

		// relating the addresses with emp obj
		e.setAddresses(addrs);

		e.show();

		
		if (e.getAddresses() != null && !e.getAddresses().isEmpty()) {
			int c =1;
			for (Address a : e.getAddresses()) {
				System.out.println("******** Address : "+(c++)+"***********");
				a.display();
			}

		} else {
			System.out.println("NO ADDRESS AVAILABLE");
		}
	}
}
