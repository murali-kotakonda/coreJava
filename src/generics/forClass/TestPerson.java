package generics.forClass;

public class TestPerson {
	public static void main(String[] args) {

		//person to hold String
		Person<String> p1 = new Person<>();//  T will be String
		p1.set("kumar");
		
		String data = p1.get();
		System.out.println(data);
		
	}
}
