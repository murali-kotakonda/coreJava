package annotations.field;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class FieldTest {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException {
		Person p = new Person("p_131376676767");
		User u = new User("pan_949289897979797");
		Product  prod = new Product("prod_214");
		
		int s1 = getDeclaredSize("annotations.field.Person","id");
		int s2 = getDeclaredSize("annotations.field.User","pan");
		int s3 = getDeclaredSize("annotations.field.Product","productId");
		int s4 = getDeclaredSize("annotations.field.Person","name");
		
		validate(p.getId(),s1);
		validate(u.getPan(),s2);
		validate(prod.getProductId(),s3);
		
	}

	private static void validate(String value, int size) {
		if(value.length()>size){
			System.out.println("Invalid size for ::"+value);
		}else{
			System.out.println("valid size for ::"+value);
		}
	}

	private static int getDeclaredSize(String className,String fieldName) throws ClassNotFoundException, NoSuchFieldException {
		Class c = Class.forName(className);
		Field field = c.getDeclaredField(fieldName);
		Annotation[] annotations = field.getDeclaredAnnotations();

		int size = -1;
		for (Annotation annotation : annotations) {
			if (annotation instanceof FieldConfig) {
				FieldConfig myAnnotation = (FieldConfig) annotation;
				size = myAnnotation.size();
			}
		}
		return size;
	}

}