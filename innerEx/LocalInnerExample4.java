package innerEx;


public class LocalInnerExample4 {
	private int data = 30;// instance variable

	void display() {
		class Local {
			void msg() {
				System.out.println(data);
			}
		}
		Local l = new Local();
		l.msg();
	}

	public static void main(String args[]) {
		LocalInnerExample4 obj = new LocalInnerExample4();
		obj.display();
	}
}
