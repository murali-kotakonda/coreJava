package threads;

/**
 - How to make the thread to sleep:
	 Thread.sleep(5000); // sleeps for 5 seconds
    exceptn handling is mandatory
 */
public class MyThread5 extends Thread {

	public void run() {
		String msg1= "Hi from "+Thread.currentThread();
		System.out.println(msg1);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		String msg2= "Bye from "+Thread.currentThread();
		System.out.println(msg2);
	}
}
