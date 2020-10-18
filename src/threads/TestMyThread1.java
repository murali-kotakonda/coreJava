package threads;

/**
 * 
 * create thread by specifying the name + priority and start the thread.
 * 
 * by default java uses main thread.
  
   Every thread has two props: name and priority [1-10]
   
   How to create thread and set props for name and priority?
        MyThread1 th1 = new MyThread1();
		th1.setName("my Thread1"); // thread name
		th1.setPriority(10);// thread priority [ 1 to 10]
	
	How to start a thread?
	th1.start();	
		
 */
public class TestMyThread1 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("start");
		MyThread1 th1 = new MyThread1();
		th1.setName("my Thread1"); // thread name
		th1.setPriority(10);// thread priority [ 1 to 10]
		
		th1.start();
		System.out.println("Bye");
	}
}
//2 threads are running in parallel
