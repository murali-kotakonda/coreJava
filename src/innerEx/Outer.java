package innerEx;

//Member inner class
public class Outer {
	private int data = 30;

	public void print(){
		System.out.println(data);
	}
	
	//inner class start
	class Inner {
		int age;
		void msg() {
			System.out.println("data is " + data); // access outer class instance variable
		}
	}
	//inner class end

}