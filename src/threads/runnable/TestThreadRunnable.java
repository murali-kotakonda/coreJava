package threads.runnable;

class TestThreadRunnable {
	public static void main(String[] args) {
		System.out.println("main: start");
		Thread th = new Thread(new MyThreadRunnable());
		th.start();	
		System.out.println("main: end");
	}
}
 
