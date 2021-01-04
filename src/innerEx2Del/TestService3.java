package innerEx2Del;

public class TestService3 {

	public static void main(String[] args) {
		Service s1 = () -> {
			System.out.println("Hello");
		};
		s1.save();
		
		Service s2 = () -> {
			System.out.println("Bye");
		};
		s2.save();
	}
}
