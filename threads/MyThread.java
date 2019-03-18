package threads;

public class MyThread extends Thread {

	@Override
	public void run() {
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread()+"Hi");
	}

}
