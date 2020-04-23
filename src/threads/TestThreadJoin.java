package threads;

public class TestThreadJoin {

	 public static void main(String[] args) throws InterruptedException {
		 System.out.println("main starts");
		Thread th = new MyThread();
		th.setName("my Thread1");
		
		
		Thread th2 = new MyThread();
		th2.setName("my Thread2");
		th2.setPriority(10);
		
		
		Thread th3 = new MyThread();
		th3.setName("my Thread3");
		th3.start();
		th.start();
		th2.start();
		
		th.join();
		th2.join();
		th3.join();
		
		System.out.println("main ends");
	}

}
