package threads.runnable;

public class TestThreadLambdaMethodRef {

	 // create 10 threads and every thread has to print hello + thread name
	 //solution: we need 1 class and 10 objects
	 //challenge:  using lambda we can create only one obj
	 // so solve by usng the lambda + method ref
	 
	 public static void main(String[] args) throws InterruptedException {
		System.out.println("main : start");
		
		Runnable r1 = TestThreadLambdaMethodRef:: print;
		Thread  th1 = new Thread(r1);
		th1.setName("mythread1");
		th1.setPriority(1);

		Runnable r2 = TestThreadLambdaMethodRef:: print;
		Thread  th2 = new Thread(r2);
		th2.setName("mythread2");
		th2.setPriority(1);
		
		th1.start();
		th2.start();
		System.out.println("main :end");
	}
	 
	 
	 public static void print() {
		 System.out.println("hello from  "+Thread.currentThread()); 
	 }
	 
	
}
