package innerEx;


interface Showable {
	void show();

	interface Message {
		void msg();
	}
}

class NestedInt7 implements Showable.Message {
	public void msg() {
		System.out.println("Hello nested interface");
	}

	public static void main(String args[]) {
		Showable.Message message = new NestedInt7();// upcasting here
		message.msg();
	}
}
