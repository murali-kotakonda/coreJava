package generics.forClass;

import com.mnp.collections.arrays36.Person;


public class TestGenericType {

	public static void main(String[] args) {
		GenericType<String> data = new GenericType<String>();
		data.set("hello");
		String str = data.get();
		System.out.println(str);

		GenericType<Person> personType= new GenericType<Person>();
		personType.set(new Person(123, "aaaa"));
		Person p = personType.get();
		System.out.println(p);
	}

}
