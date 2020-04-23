package annotations.field2;

public class FieldTest {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException {
		Person p = new Person("af");
		User u = new User("pan_949289897979797");
		Product  prod = new Product("prod_214");
		
		int s1 = ReadAnnotationValue.getDeclaredSize("annotations.field.Person","id");
		int s2 = ReadAnnotationValue.getDeclaredSize("annotations.field.User","pan");
		int s3 = ReadAnnotationValue.getDeclaredSize("annotations.field.Product","productId");
		
		validate(p.getId(),s1);
		validate(u.getPan(),s2);
		validate(prod.getProductId(),s3);
		
	}

	private static void validate(String value, int size) {
		if(value.length()<size){
			System.out.println("Invalid size for ::"+value);
		}else{
			System.out.println("valid size for ::"+value);
		}
	}

	

}