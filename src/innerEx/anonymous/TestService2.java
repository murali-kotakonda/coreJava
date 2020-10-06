package innerEx.anonymous;

public class TestService2 {
	public static void main(String[] args) {

		//  creating child child + overriding the process method + creating obj
		Service c1 = new Service() {
			public void process() {
				System.out.println("Hello");
			}
		};
		c1.process();
		
		 
		//  creating child child + overriding the process method + creating obj
		Service c2 = new Service() {
			public void process() {
						System.out.println("Bye");				
			}
		};
		
		c2.process();
	}
}
