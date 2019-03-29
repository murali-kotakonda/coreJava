package java8Features.methodRef;

interface Service {
	void process();
}

class Impl {
 //ContainingClass::staticMethodName  
	public static void execute() {
		System.out.println("Hello, this is static method execute1.");
	}
	
	public void execute2() {
		System.out.println("Hello, this is static method execute2.");
	}
}





public class TestMethodRef1{
	public static void main(String[] args) {
		// Referring static method
		Service obj = Impl::execute;
		// Calling interface method
		obj.process();
		
		
		
		Service obj1 =  new Impl()::execute2;
		obj1.process();
	}
}
