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
		Service sayable = Impl::execute;
		// Calling interface method
		sayable.process();
		
		sayable =  new Impl()::execute2;
		sayable.process();
	}
}
