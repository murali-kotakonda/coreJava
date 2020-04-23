package annotations.field2;

public class TestAnnotationRead {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {

		System.out.println("Person.id --> "+ReadAnnotationValue.getDeclaredSize("annotations.field.Person", "id"));
		System.out.println("Person.name --> "+ReadAnnotationValue.getDeclaredSize("annotations.field.Person", "name"));
		
		System.out.println("Product.productId --> "+ReadAnnotationValue.getDeclaredSize("annotations.field.Product", "productId"));
		
		System.out.println("User.pan --> "+ReadAnnotationValue.getDeclaredSize("annotations.field.User", "pan"));
		
		
	}

}
