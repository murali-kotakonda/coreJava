package threadsSyncMethod;

public class MyThread extends Thread {

	public MyThread(String name) {
		super(name);
	}
	public void run() {
		process();
	}

	private synchronized void process() {
		for(int i=1;i<=20;i++) {
			System.out.println(Thread.currentThread().getName()+ " "+i);
		}
	}
}
