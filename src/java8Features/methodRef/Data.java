package java8Features.methodRef;

public class Data {

	public static void execute() {
		System.out.println("processing cust & payment static info");
	}
	
	
	public void execute2() {
		System.out.println("processing cust & paymnet obj info");
	}
	
	
	public static void main(String[] args) {
		// Referring static method
		Service obj = Data::execute;
		// Calling interface method
		obj.process();
		
		Service obj1 =  new Data()::execute2;
		obj1.process();
	}
}



