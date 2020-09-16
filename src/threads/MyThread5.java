package threads;

/**
 - How to make the thread to sleep:
	 Thread.sleep(5000); // sleeps for 5 seconds
   
 */
public class MyThread5 extends Thread {

	public void run() {
		System.out.println("Thread stated:" + Thread.currentThread().getName()+ " is running");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}// sleep for 5 seconds
		System.out.println("Thread ended" + Thread.currentThread().getName() + " ended");
	}

}
