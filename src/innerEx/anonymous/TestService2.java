package innerEx.anonymous;

public class TestService2 {
	public static void main(String[] args) {

		Service s = new Service() {
			@Override
			public void process() {
				System.out.println("Hello");
			}
		};
		
		//  creating child child + overriding the process method + creating obj
		s.process();
		
		
		Service s2 = new Service() {
			@Override
			public void process() {
			 System.out.println("Bye");
			}
		};
		//  creating child child + overriding the process method + creating obj
		s2.process();
		
	}
}
