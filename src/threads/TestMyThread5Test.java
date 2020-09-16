package threads;

public class TestMyThread5Test {
public static void main(String[] args) {
	System.out.println("start");

	MyThread5 th1 = new MyThread5();
	th1.start();
	
	MyThread5 th2 = new MyThread5();
	th2.start();
	
	MyThread5 th3 = new MyThread5();
	th3.start();

	System.out.println("Bye");
}
}
