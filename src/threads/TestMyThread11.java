package threads;

/**
 * 
 * create thread by specifying the name + priority and start the thread.
 * 
 * by default java uses main thread.
 */
public class TestMyThread11 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("start");

		MyThread1 th1 = new MyThread1();
		th1.setName("my Thread1"); // thread name
		th1.setPriority(10);// thread priority [ 1 to 10]
		
		MyThread1 th2 = new MyThread1();
		th2.setName("my Thread2");
		th2.setPriority(5);

		MyThread1 th3 = new MyThread1();
		th3.setName("my Thread3");
		th3.setPriority(2);

		th1.start();
		th2.start();
		th3.start();

		System.out.println("Bye");
	}
}
//4 threads are running in parallel
