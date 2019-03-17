package threads;

public class TestThread {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		Thread th = new MyThread();
		th.setName("my Thread");
		
		
		Thread th2 = new MyThread();
		th2.setName("my Thread2");
		th2.setPriority(10);
		
		th.start();
		th2.start();
		
	/*	
		th.join();
		th2.join();
	*/	System.out.println(Thread.currentThread()+"Bye");

	}

}
