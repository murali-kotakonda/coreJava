package threads;

/**
 Req:
create a thread and start the thread using Runnable interface 

solution:
------------------------
create a class implements Runnable interface and provide run method
 
 */
public class MyThread2 implements Runnable {

	public void run() {
		System.out.println("Thread " + Thread.currentThread() + " is running");
	}
}

