package oops.method;

public class TestOperations {

	public static void main(String[] args) {
		// 1. create obj
		// 2. using obj call the method
		System.out.println("prog start");
		Operations op = new Operations();
		op.show();
		op.show();
		System.out.println("prog end");
		
		
		op.show1(20);
		op.show2("Aasha");
		op.show3(23,"aasha");
	}
	
}
