package threads;

public class TestMyThread {

	 public static void main(String[] args) throws InterruptedException {
		System.out.println("start");
		Thread th1 = new MyThread();
		th1.setName("my Thread1");
		th1.setPriority(10);
		
		Thread th2 = new MyThread();
		th2.setName("my Thread2");
		th2.setPriority(5);
		
		Thread th3 = new MyThread();
		th3.setName("my Thread3");
		th3.setPriority(2);
		
		th1.start();
		th2.start();
		th3.start();
		System.out.println(Thread.currentThread()+"Bye");
	}
}
