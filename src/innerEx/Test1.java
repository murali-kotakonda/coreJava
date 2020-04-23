package innerEx;


public class Test1 {
	public static void main(String args[]) {
		Outer1 obj = new Outer1();
		Outer1.Inner in = obj.new Inner();
		in.msg();
	}
}
