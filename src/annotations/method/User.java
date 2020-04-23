package annotations.method;

public class User {
	@Size(value = 20)
	public void printData() {
		System.out.println("print user info");
	}
}
