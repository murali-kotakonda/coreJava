package threadsSyncBlock1;

public class MyThread extends Thread { 
	
	private int x;
	private int y;
	
	
	private   void  incrementx()  {
		
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for(int i=0;i<100;i++)
			x++;
	}
	
	
	private   void  incrementy() {
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0;i<200;i++)
			y++;
	}
	
	public static void main(String[] args) throws InterruptedException {
		long s = System.currentTimeMillis();
		MyThread myThread = new MyThread();
		myThread.createThreads();
		long e = System.currentTimeMillis();
		System.out.println(myThread.x);
		System.out.println(myThread.y);
		System.out.println(e-s);
	}

	private  void createThreads() throws InterruptedException {
		Thread t1 = new Thread(() ->  {
			process();
		});
		
		
		Thread t2 = new Thread(() ->  {
			process();
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
	
	}

	private void process() {
		incrementx();
		incrementy();
	}
	
}

 
