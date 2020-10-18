package threads;

/**
 Req:
create a thread and start the thread using anonymous inner claas

solution:
------------------------
Apply anonymous inner claas to start the thread
 
 
 */
public class MyThread3Test {

	 public static void main(String[] args) throws InterruptedException {
		System.out.println("main : start");
		
		Runnable  r = new Runnable() {
			public void run() {
				System.out.println("Thread " + Thread.currentThread() + " is running");	
			}
		};
		
		Thread  th1 =  new Thread(r);
		th1.start();
		
		Thread  th2 =  new Thread(r);
		th2.start();
		
		System.out.println("main :end");
	}

}
