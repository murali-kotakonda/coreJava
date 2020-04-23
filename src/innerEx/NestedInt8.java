package innerEx;

class UserInt {
	interface UserAction {
		void msg();
	}
}

public class NestedInt8 implements UserInt.UserAction {
	public void msg() {
		System.out.println("Hello nested interface");
	}

	public static void main(String args[]) {
		UserInt.UserAction message = new NestedInt8();// upcasting here
		message.msg();
	}
}
