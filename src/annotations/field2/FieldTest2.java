package annotations.field2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class FieldTest2 {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException {
		Person p = new Person("p_131313113131313");
		User u = new User("pan_949241313131");
		Product  prod = new Product("prod_214141411313");
		
		System.out.println(p.getId());
		System.out.println(u.getPan());
		System.out.println(prod.getProductId());
		 
	}
 
}