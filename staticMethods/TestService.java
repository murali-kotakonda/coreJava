package staticMethods;


public class TestService {
	public static void main(String[] args) {
		//access static
		
		//instance 
		Service s = new Service();
		s.validate();
		Service.handle();
	}
}
