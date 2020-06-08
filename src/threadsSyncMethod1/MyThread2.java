package threadsSyncMethod1;

public class MyThread2 {

	private int count = 0;

	public static void main(String[] args) throws InterruptedException {
		new MyThread2().startThreads();
	}

	private synchronized void increment() {
		count++;
	}

	private void startThreads() throws InterruptedException {
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 1; i < 5000; i++) {
					increment();
				}
			}

		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 1; i < 5000; i++) {
					increment();
				}
			}
		});

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		System.out.println(count);

	}
}
