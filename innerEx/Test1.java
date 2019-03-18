package innerEx;


public class Test1 {
	public static void main(String args[]) {
		TestMemberOuter1 obj = new TestMemberOuter1();
		TestMemberOuter1.Inner in = obj.new Inner();
		in.msg();
	}
}
