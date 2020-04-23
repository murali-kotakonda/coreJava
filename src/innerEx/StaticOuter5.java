package innerEx;

public class StaticOuter5 {
	static int data = 30;
	
	int count = 23;

	static class Inner {
		void msg() {
			System.out.println("data is " + data);
			//System.out.println(count);cannot acces outer instance 
		}
	}

	public static void main(String args[]) {
		StaticOuter5.Inner obj = new StaticOuter5.Inner();
		obj.msg();
	}
}