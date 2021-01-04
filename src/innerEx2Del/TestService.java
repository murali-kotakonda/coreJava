package innerEx2Del;

public class TestService {

	public static void main(String[] args) {
		Service s1 = new Child1();
		s1.save();
		
		Service s2 = new Child2();
		s2.save();
	}
}
