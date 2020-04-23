package java8Features.methodRef;

public class TestService {
	public static void main(String[] args) {
		// approach1
		Service s = () -> {
			Data d = new Data();
			d.execute2();
		};
		s.process();

		// approach2
		Service s1 = new Data()::execute2;
		s1.process();

		Service s2 = Data::execute;
		s2.process();
	}
}
