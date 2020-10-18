package threads;

/**
 * @author I335484
 
 How to make the thread to wait for other threads?
 th.join();
 
 */
public class TestThreadJoin {

	 public static void main(String[] args) throws InterruptedException {
		 System.out.println("main starts");
		
		 Thread th1 = new MyThread1();
		th1.setName("my Thread1");
		
		
		Thread th2 = new MyThread1();
		th2.setName("my Thread2");
		th2.setPriority(10);
		
		
		Thread th3 = new MyThread1();
		th3.setName("my Thread3");
		
		th1.start();
		th3.start();
		th2.start();
		
		th1.join();// main thread will wait until th thread completes execution
		th2.join();// main thread will wait until th2 thread completes execution
		th3.join();// main thread will wait until th3 thread completes execution
		
		System.out.println("main ends");
	}
}