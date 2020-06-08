package threadsSyncMethod1;

public class MyThread {

	private int count = 0;

	public static void main(String[] args) throws InterruptedException {
		new MyThread().startThreads();
	}

	private void startThreads() throws InterruptedException {
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 10; i < 5000; i++) {
					count++;
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 10; i < 5000; i++) {
					count++;
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
