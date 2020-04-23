package threads.runnable;

public class MyThreadRunnable implements Runnable {

	public void run() {
		System.out.println("Thread " + Thread.currentThread().getId() + " is running");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread " + Thread.currentThread().getId() + " ended");
	}
}

