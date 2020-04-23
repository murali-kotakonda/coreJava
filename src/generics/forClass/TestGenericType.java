package generics.forClass;

import ds.collections.al.Person;

public class TestGenericType {

	public static void main(String[] args) {
		GenericType<String> data = new GenericType<String>();
		data.set("hello");
		String str = data.get();
		System.out.println(str);
		
		GenericType<Integer> data1 = new GenericType<Integer>();
		data1.set(23);
		int d = data1.get();
		System.out.println(d);

		GenericType<Employee> empType= new GenericType<Employee>();
		Employee pObj = new Employee(123, "aaaa",67);
		empType.set(pObj);
		Employee p = empType.get();
		System.out.println(p);
	}
	
}
